// Test MotherBoard class

import motherboard.MotherBoard;

import cpu_socket.CpuSocket;
import ddr_socket.DdrSocket;
import sata_socket.SataSocket;
import pci_socket.PciSocket;
import sound_card.SoundCard;
import usb_hub.UsbHub;
import ethernet_modem.EthernetModem;

import debug_log.DebugLog;

class MotherBoardTest{
    public static void main(String[] args) {
        ConfigureMotherboard();
    }

    public static void ConfigureMotherboard(){
        cpu_socket.CpuSocket cpuSocket1 = new CpuSocket();
        // CpuSocket cpuSocket2 = new CpuSocket();
        // MotherBoard motherboard1 = new MotherBoard();
        //
        // cpuSocket1.ConfigureSocket("22", "AM3825", "MahNigga");
        //
        // motherboard1.ConfigureOnboardDevice(cpuSocket1);
        // motherboard1.ConfigureOnboardDevice(cpuSocket2);
    }
}
