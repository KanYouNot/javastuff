// Encapsulation is restricting direct access to an object's data by using private fields
// and providing controlled access through public methods.

// Encapsulation example:

public class encapsulation{
        public static void main(String[] args) {
                Engine myEngine = new Engine();

                // myEngine.engineState = true; This won't work

                // The only way to change engineState value is with these methods
                myEngine.startEngine();
                myEngine.stopEngine();
        }
}

class Engine {
        private boolean engineState = false; // Private: cannot be accessed directly

        public void startEngine() {
                if (engineState) {
                        System.out.println("The engine is already running.");
                } else {
                        engineState = true;
                        System.out.println("The engine has started.");
                }
        }

        public void stopEngine() {
                if (engineState) {
                        engineState = false;
                        System.out.println("The engine has stopped.");
                } else {
                        System.out.println("The engine is already off.");
                }
        }
}
