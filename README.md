# Redis Cache

## What is Redis? (Redis stands for Remote Directory Server)

Redis is a high performance in-memory data store. Redis can be used as a NoSQL database, distributed cache or a Message Broker. Redis supports various data structures like String, Hashes, List, Sets, Sortedsets, Bitmaps, HyperLogLog and Geo Spatial Indexes etc.

**Redis as an in-memory key-value data store** - Redis stores data directly in RAM, allowing ultra fast data access compared to disk based systems.

**Imploement Redis for caching frequently accessed data** - Caching reduces latency by storing popular data in memory, improving application response times.

**Manage web application session with Redis** - Session management via Redis ensures quick retrieval and scalability for user sessions in web apps.

**Redis for Publish/Subscribe messaging systems** - Redis enables efficient messaging patterns for real-time communication between distributed systems.

**Improve system performance by minimizing disk I/O latency** - By storing data in RAM, redis reduces reliance on slower disk operations, enhancing overall system speed.

Redis has 2 main components Redis client and Redis Server. Both client and server can be on the same computer or can also be on 2 different computers. Redis can also be considered as Master Slave configuration for distributed systems.

Redis is exceptionally fast. It can perform about 110000 SETs per second, about 81000 GETs per second. While all the data lives in memory, changes are synchronously saved on disk. It has rich support of data types. All redis operations are atomic, which ensures that if two clients concurrently access, Redis server will receive the updated value. 

## Install Redis on Windows.

Follow the following documentation from redis and install Redis on windows. First we need to enable WSL on windows. Because Redis is officially not supported on windows.
https://redis.io/docs/latest/operate/oss_and_stack/install/archive/install-redis/install-redis-on-windows/

## Start Redis Server
redis-server --daemonize yes

### Run Redis client
open wsl on Windows
> redis-cli



