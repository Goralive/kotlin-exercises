package effective.collections.primeaccess

import kotlin.random.Random
import kotlin.system.measureTimeMillis

class PrimeAccessRepository(
    private val primeAccessList: PrimeAccessList
) {
    private val associatedList = primeAccessList.entries.associateBy { it.userId }
    fun isOnAllowList(userId: String): Boolean = associatedList[userId]
        ?.allowList
        ?: false

    fun isOnDenyList(userId: String): Boolean = associatedList[userId]
        ?.denyList
        ?: false
}

class PrimeAccessList(
    val entries: List<PrimeAccessEntry>
)

class PrimeAccessEntry(
    val userId: String,
    val allowList: Boolean,
    val denyList: Boolean,
)
//Class creation took 1 ms
//Operation took 3616 ms
//Operation took 3328 ms

//AssociatedList
//Class creation took 41 ms
//Operation took 3 ms
//Operation took 1 m
fun main() {
    val entries = List(200_000) {
        PrimeAccessEntry(
            userId = it.toString(),
            allowList = Random.nextBoolean(),
            denyList = Random.nextBoolean()
        )
    }.shuffled()
    val accessList = PrimeAccessList(entries)
    
    val repo: PrimeAccessRepository
    measureTimeMillis {
        repo = PrimeAccessRepository(accessList)
    }.also { println("Class creation took $it ms") }
    
    measureTimeMillis {
        for (userId in 1L..10_000L) {
            repo.isOnAllowList(userId.toString())
        }
    }.also { println("Operation took $it ms") }
    
    measureTimeMillis {
        for (userId in 1L..10_000L) {
            repo.isOnDenyList(userId.toString())
        }
    }.also { println("Operation took $it ms") }
}
