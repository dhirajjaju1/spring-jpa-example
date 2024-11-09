This project is about demonstrating loading of Parent and child entities in below 2 conditions 
1. load only Parent entities initially and lazy load child entities
2. load both Parent and child entity immediately upon request

By Default child entity is set to fetch = FetchType.LAZY so that it will get lazyly loaded

Parent entity is having 2 child entities
1. Child - marked as fetch = FetchType.LAZY & getter is mention with @Transient
2. Child2 - marked as fetch = FetchType.EAGER


If caller pass fetchPolicy attributes then application is loading Child entity eagerly otherwise if will be lazyly loaded

Entry point will be /aig/parent/