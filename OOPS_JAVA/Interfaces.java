/*
* Created on 14 Mar 2025
* 
* @author Sai Sumanth
*/

interface MediaPlayer {
    int x = 90; // Implicity public static final, so it belongs to interface itself

    abstract void play();

    // every method like this are Implicitly public & abstract, no need to specify
    // as abstract
    void stop();
}

interface Engine {
    int x = 99;

    void start();

    void stop();
}

class PetrolCar implements MediaPlayer, Engine {
    String carColor;

    PetrolCar(String color) {
        this.carColor = color;
    }

    @Override
    public void start() {
        System.out.println("engine started");
    }

    @Override
    public void stop() {
        System.out.println("engine stopped");
    }

    @Override
    public void play() {
        System.out.println("playing musicx");
    }

    /*
     * ???? Now what about the stop method of MediaPlayer ?????
     * Engine interface also have stop method. only one method can be overriden.
     * Check the below example on how to solve this problem
     */

}

class TurboEngineV6 implements Engine {

    @Override
    public void start() {
        System.out.println("v6 engine started");
    }

    @Override
    public void stop() {
        System.out.println("v6 engine stopped");
    }
}

class BoseMediaPlayer implements MediaPlayer {

    @Override
    public void play() {
        System.out.println("started playing music");
    }

    @Override
    public void stop() {
        System.out.println("stopped playing music");
    }

}

class DieselCar {
    String carColor;
    private Engine carEngine;
    private MediaPlayer mediaPlayer;

    public DieselCar(String carColor, Engine carEngine, MediaPlayer mediaPlayer) {
        this.carColor = carColor;
        this.carEngine = carEngine;
        this.mediaPlayer = mediaPlayer;
    }

    // Engine methods
    void startEngine() {
        this.carEngine.start();
    }

    void stopEngine() {
        this.carEngine.stop();
    }

    // Music related Methods
    void startMusic() {
        this.mediaPlayer.play();
    }

    void stopMusic() {
        this.mediaPlayer.stop();
    }
}

public class Interfaces {
    public static void main(String[] args) {

        System.out.println(MediaPlayer.x);
        System.out.println(Engine.x);

        PetrolCar pc = new PetrolCar("Black");
        pc.start();

        pc.play();
        pc.stop(); // we intended to stop music, but engine got stopped. see below example to
                   // overcome this problem

        MediaPlayer mp = new BoseMediaPlayer();
        Engine engine = new TurboEngineV6();
        DieselCar dc = new DieselCar("Ferrari Red", engine, mp);
        dc.startEngine();

        dc.startMusic();
        dc.stopMusic();

        dc.stopEngine();
    }
}