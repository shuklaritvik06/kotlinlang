fun main(){
    outerLoop@ for (i in 1..100) {
        if (i==1){
            break@outerLoop
        }
        if (i==4){
            continue@outerLoop
        }
    }
}