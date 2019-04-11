package com.kun.proxy.dyn;

import java.lang.reflect.Proxy;

/**
 * @author kun
 * @data 2019/3/25 17:30
 */
class MatchService {
    MatchService(){
        PersonBean joe = getPersonInfo("joe", "male", "running");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        System.out.println("Interests is " + ownerProxy.getInterests());
        ownerProxy.setInterests("Bowling");
        System.out.println("Interests is " + ownerProxy.getInterests());
        ownerProxy.setHotOrNotRating(50);
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
        ownerProxy.setHotOrNotRating(40);
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
        System.out.println("***************************");
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        System.out.println("Interests is " + nonOwnerProxy.getInterests());
        nonOwnerProxy.setInterests("haha");
        System.out.println("Interests is " + nonOwnerProxy.getInterests());
        nonOwnerProxy.setHotOrNotRating(60);
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }

    private PersonBean getNonOwnerProxy(PersonBean person){
        return (PersonBean)Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }

    private PersonBean getPersonInfo(String name, String gender, String interests) {
        PersonBean person = new PersonBeanImpl();
        person.setName(name);
        person.setGender(gender);
        person.setInterests(interests);
        return person;
    }
}
