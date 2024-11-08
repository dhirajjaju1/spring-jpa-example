This project is about demostrating loading of Parent and child entities in below 2 conditions 
1. load only Parent entities initially and lazyly load child entities
2. load both Parent and child entity immediately

By Default child entity is set to fetch = FetchType.LAZY so that it will get lazyly loaded
and then make a use of @Transactional annotation to fetch Parent along with child entity and having another implementation Without @Transactional to only fetch Parent.

You can follow the same under https://github.com/dhirajjaju1/spring-jpa-example/blob/3fc6afb936f16b22cbade48854f6ce1e07ac9019/src/main/java/com/aig/jpa/demo/service/ParentChildService.java#L29
