import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberInTheLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberInTheUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberUnderTheLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveTheUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextRadioStationIfLast() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePreviousRadioStationIfNotLast() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePreviousRadioStationIfFirst() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetupCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeInTheLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeInTheUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    
     @Test
    public void shouldNotSetVolumeUnderTheUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    
     @Test // If there button "-" is avaliable
    public void shouldNotSetVolumeUnderTheLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfNotLast() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeIfLast() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolumeIfNotFirst() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.downVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceVolumeIfFirst() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.downVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

}
