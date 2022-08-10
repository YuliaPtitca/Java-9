import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(2);
        int actual = rad.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentStationUnderMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentStationOverMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldNextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(2);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(2);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(6);
        int actual = rad.getCurrentVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeUnderMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentVolumeOverMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentDownVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.downVolume();
        int actual = rad.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentDownVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.downVolume();
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentUpRadioVolumeMax() { // Повысить громкость с максимальным значением
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentUpRadioVolumeOverMax() { // Повысить громкость указав c минимальное значение
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }
}
