/*
 * Copyright (C) 2017 Willian Alves Lima
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package objetosXML.mRmote;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ConfCons - configuração mRemote
 * Elemento do tipo Node."
 * @author Willian Alves Lima
 */
public class Node implements ColecaoDeNodes {
    private String Name="Nome Node";
private String Type="Container";
private String Expanded="True";
private String Descr="";
private String Icon="mRemote";
private String Panel="General";
private String Username="";
private String Domain="";
private String Password="";
private String Hostname="";
private String Protocol="IntApp";
private String PuttySession="Default Settings";
private String Port="0";
private String ConnectToConsole="False"; 
private String UseCredSsp="True";
private String RenderingEngine="IE";
private String ICAEncryptionStrength="EncrBasic";
private String RDPAuthenticationLevel="NoAuth";
private String LoadBalanceInfo="";
private String Colors="Colors16Bit";
private String Resolution="FitToWindow";
private String AutomaticResize="True";
private String DisplayWallpaper="False";
private String DisplayThemes="False";
private String EnableFontSmoothing="False";
private String EnableDesktopComposition="False";
private String CacheBitmaps="True";
private String RedirectDiskDrives="False";
private String RedirectPorts="False";
private String RedirectPrinters="False";
private String RedirectSmartCards="False";
private String RedirectSound="DoNotPlay";
private String RedirectKeys="False";
private String Connected="False";
private String PreExtApp="";
private String PostExtApp="";
private String MacAddress="";
private String UserField="";
private String ExtApp="";
private String VNCCompression="CompNone";
private String VNCEncoding="EncHextile";
private String VNCAuthMode="AuthVNC";
private String VNCProxyType="ProxyNone";
private String VNCProxyIP="";
private String VNCProxyPort="0";
private String VNCProxyUsername="";
private String VNCProxyPassword="";
private String VNCColors="ColNormal";
private String VNCSmartSizeMode="SmartSAspect";
private String VNCViewOnly="False";
private String RDGatewayUsageMethod="Never";
private String RDGatewayHostname="";
private String RDGatewayUseConnectionCredentials="Yes";
private String RDGatewayUsername="";
private String RDGatewayPassword="";
private String RDGatewayDomain="";
private String InheritCacheBitmaps="False";
private String InheritColors="False";
private String InheritDescription="False";
private String InheritDisplayThemes="False";
private String InheritDisplayWallpaper="False";
private String InheritEnableFontSmoothing="False";
private String InheritEnableDesktopComposition="False";
private String InheritDomain="False";
private String InheritIcon="False";
private String InheritPanel="False";
private String InheritPassword="False";
private String InheritPort="False";
private String InheritProtocol="False";
private String InheritPuttySession="False";
private String InheritRedirectDiskDrives="False";
private String InheritRedirectKeys="False";
private String InheritRedirectPorts="False";
private String InheritRedirectPrinters="False";
private String InheritRedirectSmartCards="False";
private String InheritRedirectSound="False";
private String  InheritResolution="False";
private String InheritAutomaticResize="False";
private String  InheritUseConsoleSession="False";
private String  InheritUseCredSsp="False";
private String InheritRenderingEngine="False";
private String  InheritUsername="False";
private String InheritICAEncryptionStrength="False";
private String  InheritRDPAuthenticationLevel="False";
private String  InheritLoadBalanceInfo="False";
private String InheritPreExtApp="False";
private String InheritPostExtApp="False";
private String  InheritMacAddress="False";
private String InheritUserField="False";
private String InheritExtApp="False";
private String InheritVNCCompression="False";
private String InheritVNCEncoding="False";
private String InheritVNCAuthMode="False";
private String InheritVNCProxyType="False";
private String InheritVNCProxyIP="False";
private String InheritVNCProxyPort="False";
private String InheritVNCProxyUsername="False";
private String InheritVNCProxyPassword="False";
private String InheritVNCColors="False";
private String InheritVNCSmartSizeMode="False";
private String InheritVNCViewOnly="False";
private String InheritRDGatewayUsageMethod="False";
private String InheritRDGatewayHostname="False";
private String InheritRDGatewayUseConnectionCredentials="False";
private String InheritRDGatewayUsername="False";
private String InheritRDGatewayPassword="False";
private String InheritRDGatewayDomain="False";
private ArrayList<Node> nodes = new ArrayList<>();
private Iterator<Node> iterator = null;    
   
//metodos públicos

    @Override
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getExpanded() {
        return Expanded;
    }

    public void setExpanded(String Expanded) {
        this.Expanded = Expanded;
    }

    public String getDescr() {
        return Descr;
    }

    public void setDescr(String Descr) {
        this.Descr = Descr;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    public String getPanel() {
        return Panel;
    }

    public void setPanel(String Panel) {
        this.Panel = Panel;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getHostname() {
        return Hostname;
    }

    public void setHostname(String Hostname) {
        this.Hostname = Hostname;
    }

    public String getProtocol() {
        return Protocol;
    }

    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public String getPuttySession() {
        return PuttySession;
    }

    public void setPuttySession(String PuttySession) {
        this.PuttySession = PuttySession;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String Port) {
        this.Port = Port;
    }

    public String getConnectToConsole() {
        return ConnectToConsole;
    }

    public void setConnectToConsole(String ConnectToConsole) {
        this.ConnectToConsole = ConnectToConsole;
    }

    public String getUseCredSsp() {
        return UseCredSsp;
    }

    public void setUseCredSsp(String UseCredSsp) {
        this.UseCredSsp = UseCredSsp;
    }

    public String getRenderingEngine() {
        return RenderingEngine;
    }

    public void setRenderingEngine(String RenderingEngine) {
        this.RenderingEngine = RenderingEngine;
    }

    public String getICAEncryptionStrength() {
        return ICAEncryptionStrength;
    }

    public void setICAEncryptionStrength(String ICAEncryptionStrength) {
        this.ICAEncryptionStrength = ICAEncryptionStrength;
    }

    public String getRDPAuthenticationLevel() {
        return RDPAuthenticationLevel;
    }

    public void setRDPAuthenticationLevel(String RDPAuthenticationLevel) {
        this.RDPAuthenticationLevel = RDPAuthenticationLevel;
    }

    public String getLoadBalanceInfo() {
        return LoadBalanceInfo;
    }

    public void setLoadBalanceInfo(String LoadBalanceInfo) {
        this.LoadBalanceInfo = LoadBalanceInfo;
    }

    public String getColors() {
        return Colors;
    }

    public void setColors(String Colors) {
        this.Colors = Colors;
    }

    public String getResolution() {
        return Resolution;
    }

    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public String getAutomaticResize() {
        return AutomaticResize;
    }

    public void setAutomaticResize(String AutomaticResize) {
        this.AutomaticResize = AutomaticResize;
    }

    public String getDisplayWallpaper() {
        return DisplayWallpaper;
    }

    public void setDisplayWallpaper(String DisplayWallpaper) {
        this.DisplayWallpaper = DisplayWallpaper;
    }

    public String getDisplayThemes() {
        return DisplayThemes;
    }

    public void setDisplayThemes(String DisplayThemes) {
        this.DisplayThemes = DisplayThemes;
    }

    public String getEnableFontSmoothing() {
        return EnableFontSmoothing;
    }

    public void setEnableFontSmoothing(String EnableFontSmoothing) {
        this.EnableFontSmoothing = EnableFontSmoothing;
    }

    public String getEnableDesktopComposition() {
        return EnableDesktopComposition;
    }

    public void setEnableDesktopComposition(String EnableDesktopComposition) {
        this.EnableDesktopComposition = EnableDesktopComposition;
    }

    public String getCacheBitmaps() {
        return CacheBitmaps;
    }

    public void setCacheBitmaps(String CacheBitmaps) {
        this.CacheBitmaps = CacheBitmaps;
    }

    public String getRedirectDiskDrives() {
        return RedirectDiskDrives;
    }

    public void setRedirectDiskDrives(String RedirectDiskDrives) {
        this.RedirectDiskDrives = RedirectDiskDrives;
    }

    public String getRedirectPorts() {
        return RedirectPorts;
    }

    public void setRedirectPorts(String RedirectPorts) {
        this.RedirectPorts = RedirectPorts;
    }

    public String getRedirectPrinters() {
        return RedirectPrinters;
    }

    public void setRedirectPrinters(String RedirectPrinters) {
        this.RedirectPrinters = RedirectPrinters;
    }

    public String getRedirectSmartCards() {
        return RedirectSmartCards;
    }

    public void setRedirectSmartCards(String RedirectSmartCards) {
        this.RedirectSmartCards = RedirectSmartCards;
    }

    public String getRedirectSound() {
        return RedirectSound;
    }

    public void setRedirectSound(String RedirectSound) {
        this.RedirectSound = RedirectSound;
    }

    public String getRedirectKeys() {
        return RedirectKeys;
    }

    public void setRedirectKeys(String RedirectKeys) {
        this.RedirectKeys = RedirectKeys;
    }

    public String getConnected() {
        return Connected;
    }

    public void setConnected(String Connected) {
        this.Connected = Connected;
    }

    public String getPreExtApp() {
        return PreExtApp;
    }

    public void setPreExtApp(String PreExtApp) {
        this.PreExtApp = PreExtApp;
    }

    public String getPostExtApp() {
        return PostExtApp;
    }

    public void setPostExtApp(String PostExtApp) {
        this.PostExtApp = PostExtApp;
    }

    public String getMacAddress() {
        return MacAddress;
    }

    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    public String getUserField() {
        return UserField;
    }

    public void setUserField(String UserField) {
        this.UserField = UserField;
    }

    public String getExtApp() {
        return ExtApp;
    }

    public void setExtApp(String ExtApp) {
        this.ExtApp = ExtApp;
    }

    public String getVNCCompression() {
        return VNCCompression;
    }

    public void setVNCCompression(String VNCCompression) {
        this.VNCCompression = VNCCompression;
    }

    public String getVNCEncoding() {
        return VNCEncoding;
    }

    public void setVNCEncoding(String VNCEncoding) {
        this.VNCEncoding = VNCEncoding;
    }

    public String getVNCAuthMode() {
        return VNCAuthMode;
    }

    public void setVNCAuthMode(String VNCAuthMode) {
        this.VNCAuthMode = VNCAuthMode;
    }

    public String getVNCProxyType() {
        return VNCProxyType;
    }

    public void setVNCProxyType(String VNCProxyType) {
        this.VNCProxyType = VNCProxyType;
    }

    public String getVNCProxyIP() {
        return VNCProxyIP;
    }

    public void setVNCProxyIP(String VNCProxyIP) {
        this.VNCProxyIP = VNCProxyIP;
    }

    public String getVNCProxyPort() {
        return VNCProxyPort;
    }

    public void setVNCProxyPort(String VNCProxyPort) {
        this.VNCProxyPort = VNCProxyPort;
    }

    public String getVNCProxyUsername() {
        return VNCProxyUsername;
    }

    public void setVNCProxyUsername(String VNCProxyUsername) {
        this.VNCProxyUsername = VNCProxyUsername;
    }

    public String getVNCProxyPassword() {
        return VNCProxyPassword;
    }

    public void setVNCProxyPassword(String VNCProxyPassword) {
        this.VNCProxyPassword = VNCProxyPassword;
    }

    public String getVNCColors() {
        return VNCColors;
    }

    public void setVNCColors(String VNCColors) {
        this.VNCColors = VNCColors;
    }

    public String getVNCSmartSizeMode() {
        return VNCSmartSizeMode;
    }

    public void setVNCSmartSizeMode(String VNCSmartSizeMode) {
        this.VNCSmartSizeMode = VNCSmartSizeMode;
    }

    public String getVNCViewOnly() {
        return VNCViewOnly;
    }

    public void setVNCViewOnly(String VNCViewOnly) {
        this.VNCViewOnly = VNCViewOnly;
    }

    public String getRDGatewayUsageMethod() {
        return RDGatewayUsageMethod;
    }

    public void setRDGatewayUsageMethod(String RDGatewayUsageMethod) {
        this.RDGatewayUsageMethod = RDGatewayUsageMethod;
    }

    public String getRDGatewayHostname() {
        return RDGatewayHostname;
    }

    public void setRDGatewayHostname(String RDGatewayHostname) {
        this.RDGatewayHostname = RDGatewayHostname;
    }

    public String getRDGatewayUseConnectionCredentials() {
        return RDGatewayUseConnectionCredentials;
    }

    public void setRDGatewayUseConnectionCredentials(String RDGatewayUseConnectionCredentials) {
        this.RDGatewayUseConnectionCredentials = RDGatewayUseConnectionCredentials;
    }

    public String getRDGatewayUsername() {
        return RDGatewayUsername;
    }

    public void setRDGatewayUsername(String RDGatewayUsername) {
        this.RDGatewayUsername = RDGatewayUsername;
    }

    public String getRDGatewayPassword() {
        return RDGatewayPassword;
    }

    public void setRDGatewayPassword(String RDGatewayPassword) {
        this.RDGatewayPassword = RDGatewayPassword;
    }

    public String getRDGatewayDomain() {
        return RDGatewayDomain;
    }

    public void setRDGatewayDomain(String RDGatewayDomain) {
        this.RDGatewayDomain = RDGatewayDomain;
    }

    public String getInheritCacheBitmaps() {
        return InheritCacheBitmaps;
    }

    public void setInheritCacheBitmaps(String InheritCacheBitmaps) {
        this.InheritCacheBitmaps = InheritCacheBitmaps;
    }

    public String getInheritColors() {
        return InheritColors;
    }

    public void setInheritColors(String InheritColors) {
        this.InheritColors = InheritColors;
    }

    public String getInheritDescription() {
        return InheritDescription;
    }

    public void setInheritDescription(String InheritDescription) {
        this.InheritDescription = InheritDescription;
    }

    public String getInheritDisplayThemes() {
        return InheritDisplayThemes;
    }

    public void setInheritDisplayThemes(String InheritDisplayThemes) {
        this.InheritDisplayThemes = InheritDisplayThemes;
    }

    public String getInheritDisplayWallpaper() {
        return InheritDisplayWallpaper;
    }

    public void setInheritDisplayWallpaper(String InheritDisplayWallpaper) {
        this.InheritDisplayWallpaper = InheritDisplayWallpaper;
    }

    public String getInheritEnableFontSmoothing() {
        return InheritEnableFontSmoothing;
    }

    public void setInheritEnableFontSmoothing(String InheritEnableFontSmoothing) {
        this.InheritEnableFontSmoothing = InheritEnableFontSmoothing;
    }

    public String getInheritEnableDesktopComposition() {
        return InheritEnableDesktopComposition;
    }

    public void setInheritEnableDesktopComposition(String InheritEnableDesktopComposition) {
        this.InheritEnableDesktopComposition = InheritEnableDesktopComposition;
    }

    public String getInheritDomain() {
        return InheritDomain;
    }

    public void setInheritDomain(String InheritDomain) {
        this.InheritDomain = InheritDomain;
    }

    public String getInheritIcon() {
        return InheritIcon;
    }

    public void setInheritIcon(String InheritIcon) {
        this.InheritIcon = InheritIcon;
    }

    public String getInheritPanel() {
        return InheritPanel;
    }

    public void setInheritPanel(String InheritPanel) {
        this.InheritPanel = InheritPanel;
    }

    public String getInheritPassword() {
        return InheritPassword;
    }

    public void setInheritPassword(String InheritPassword) {
        this.InheritPassword = InheritPassword;
    }

    public String getInheritPort() {
        return InheritPort;
    }

    public void setInheritPort(String InheritPort) {
        this.InheritPort = InheritPort;
    }

    public String getInheritProtocol() {
        return InheritProtocol;
    }

    public void setInheritProtocol(String InheritProtocol) {
        this.InheritProtocol = InheritProtocol;
    }

    public String getInheritPuttySession() {
        return InheritPuttySession;
    }

    public void setInheritPuttySession(String InheritPuttySession) {
        this.InheritPuttySession = InheritPuttySession;
    }

    public String getInheritRedirectDiskDrives() {
        return InheritRedirectDiskDrives;
    }

    public void setInheritRedirectDiskDrives(String InheritRedirectDiskDrives) {
        this.InheritRedirectDiskDrives = InheritRedirectDiskDrives;
    }

    public String getInheritRedirectKeys() {
        return InheritRedirectKeys;
    }

    public void setInheritRedirectKeys(String InheritRedirectKeys) {
        this.InheritRedirectKeys = InheritRedirectKeys;
    }

    public String getInheritRedirectPorts() {
        return InheritRedirectPorts;
    }

    public void setInheritRedirectPorts(String InheritRedirectPorts) {
        this.InheritRedirectPorts = InheritRedirectPorts;
    }

    public String getInheritRedirectPrinters() {
        return InheritRedirectPrinters;
    }

    public void setInheritRedirectPrinters(String InheritRedirectPrinters) {
        this.InheritRedirectPrinters = InheritRedirectPrinters;
    }

    public String getInheritRedirectSmartCards() {
        return InheritRedirectSmartCards;
    }

    public void setInheritRedirectSmartCards(String InheritRedirectSmartCards) {
        this.InheritRedirectSmartCards = InheritRedirectSmartCards;
    }

    public String getInheritRedirectSound() {
        return InheritRedirectSound;
    }

    public void setInheritRedirectSound(String InheritRedirectSound) {
        this.InheritRedirectSound = InheritRedirectSound;
    }

    public String getInheritResolution() {
        return InheritResolution;
    }

    public void setInheritResolution(String InheritResolution) {
        this.InheritResolution = InheritResolution;
    }

    public String getInheritAutomaticResize() {
        return InheritAutomaticResize;
    }

    public void setInheritAutomaticResize(String InheritAutomaticResize) {
        this.InheritAutomaticResize = InheritAutomaticResize;
    }

    public String getInheritUseConsoleSession() {
        return InheritUseConsoleSession;
    }

    public void setInheritUseConsoleSession(String InheritUseConsoleSession) {
        this.InheritUseConsoleSession = InheritUseConsoleSession;
    }

    public String getInheritUseCredSsp() {
        return InheritUseCredSsp;
    }

    public void setInheritUseCredSsp(String InheritUseCredSsp) {
        this.InheritUseCredSsp = InheritUseCredSsp;
    }

    public String getInheritRenderingEngine() {
        return InheritRenderingEngine;
    }

    public void setInheritRenderingEngine(String InheritRenderingEngine) {
        this.InheritRenderingEngine = InheritRenderingEngine;
    }

    public String getInheritUsername() {
        return InheritUsername;
    }

    public void setInheritUsername(String InheritUsername) {
        this.InheritUsername = InheritUsername;
    }

    public String getInheritICAEncryptionStrength() {
        return InheritICAEncryptionStrength;
    }

    public void setInheritICAEncryptionStrength(String InheritICAEncryptionStrength) {
        this.InheritICAEncryptionStrength = InheritICAEncryptionStrength;
    }

    public String getInheritRDPAuthenticationLevel() {
        return InheritRDPAuthenticationLevel;
    }

    public void setInheritRDPAuthenticationLevel(String InheritRDPAuthenticationLevel) {
        this.InheritRDPAuthenticationLevel = InheritRDPAuthenticationLevel;
    }

    public String getInheritLoadBalanceInfo() {
        return InheritLoadBalanceInfo;
    }

    public void setInheritLoadBalanceInfo(String InheritLoadBalanceInfo) {
        this.InheritLoadBalanceInfo = InheritLoadBalanceInfo;
    }

    public String getInheritPreExtApp() {
        return InheritPreExtApp;
    }

    public void setInheritPreExtApp(String InheritPreExtApp) {
        this.InheritPreExtApp = InheritPreExtApp;
    }

    public String getInheritPostExtApp() {
        return InheritPostExtApp;
    }

    public void setInheritPostExtApp(String InheritPostExtApp) {
        this.InheritPostExtApp = InheritPostExtApp;
    }

    public String getInheritMacAddress() {
        return InheritMacAddress;
    }

    public void setInheritMacAddress(String InheritMacAddress) {
        this.InheritMacAddress = InheritMacAddress;
    }

    public String getInheritUserField() {
        return InheritUserField;
    }

    public void setInheritUserField(String InheritUserField) {
        this.InheritUserField = InheritUserField;
    }

    public String getInheritExtApp() {
        return InheritExtApp;
    }

    public void setInheritExtApp(String InheritExtApp) {
        this.InheritExtApp = InheritExtApp;
    }

    public String getInheritVNCCompression() {
        return InheritVNCCompression;
    }

    public void setInheritVNCCompression(String InheritVNCCompression) {
        this.InheritVNCCompression = InheritVNCCompression;
    }

    public String getInheritVNCEncoding() {
        return InheritVNCEncoding;
    }

    public void setInheritVNCEncoding(String InheritVNCEncoding) {
        this.InheritVNCEncoding = InheritVNCEncoding;
    }

    public String getInheritVNCAuthMode() {
        return InheritVNCAuthMode;
    }

    public void setInheritVNCAuthMode(String InheritVNCAuthMode) {
        this.InheritVNCAuthMode = InheritVNCAuthMode;
    }

    public String getInheritVNCProxyType() {
        return InheritVNCProxyType;
    }

    public void setInheritVNCProxyType(String InheritVNCProxyType) {
        this.InheritVNCProxyType = InheritVNCProxyType;
    }

    public String getInheritVNCProxyIP() {
        return InheritVNCProxyIP;
    }

    public void setInheritVNCProxyIP(String InheritVNCProxyIP) {
        this.InheritVNCProxyIP = InheritVNCProxyIP;
    }

    public String getInheritVNCProxyPort() {
        return InheritVNCProxyPort;
    }

    public void setInheritVNCProxyPort(String InheritVNCProxyPort) {
        this.InheritVNCProxyPort = InheritVNCProxyPort;
    }

    public String getInheritVNCProxyUsername() {
        return InheritVNCProxyUsername;
    }

    public void setInheritVNCProxyUsername(String InheritVNCProxyUsername) {
        this.InheritVNCProxyUsername = InheritVNCProxyUsername;
    }

    public String getInheritVNCProxyPassword() {
        return InheritVNCProxyPassword;
    }

    public void setInheritVNCProxyPassword(String InheritVNCProxyPassword) {
        this.InheritVNCProxyPassword = InheritVNCProxyPassword;
    }

    public String getInheritVNCColors() {
        return InheritVNCColors;
    }

    public void setInheritVNCColors(String InheritVNCColors) {
        this.InheritVNCColors = InheritVNCColors;
    }

    public String getInheritVNCSmartSizeMode() {
        return InheritVNCSmartSizeMode;
    }

    public void setInheritVNCSmartSizeMode(String InheritVNCSmartSizeMode) {
        this.InheritVNCSmartSizeMode = InheritVNCSmartSizeMode;
    }

    public String getInheritVNCViewOnly() {
        return InheritVNCViewOnly;
    }

    public void setInheritVNCViewOnly(String InheritVNCViewOnly) {
        this.InheritVNCViewOnly = InheritVNCViewOnly;
    }

    public String getInheritRDGatewayUsageMethod() {
        return InheritRDGatewayUsageMethod;
    }

    public void setInheritRDGatewayUsageMethod(String InheritRDGatewayUsageMethod) {
        this.InheritRDGatewayUsageMethod = InheritRDGatewayUsageMethod;
    }

    public String getInheritRDGatewayHostname() {
        return InheritRDGatewayHostname;
    }

    public void setInheritRDGatewayHostname(String InheritRDGatewayHostname) {
        this.InheritRDGatewayHostname = InheritRDGatewayHostname;
    }

    public String getInheritRDGatewayUseConnectionCredentials() {
        return InheritRDGatewayUseConnectionCredentials;
    }

    public void setInheritRDGatewayUseConnectionCredentials(String InheritRDGatewayUseConnectionCredentials) {
        this.InheritRDGatewayUseConnectionCredentials = InheritRDGatewayUseConnectionCredentials;
    }

    public String getInheritRDGatewayUsername() {
        return InheritRDGatewayUsername;
    }

    public void setInheritRDGatewayUsername(String InheritRDGatewayUsername) {
        this.InheritRDGatewayUsername = InheritRDGatewayUsername;
    }

    public String getInheritRDGatewayPassword() {
        return InheritRDGatewayPassword;
    }

    public void setInheritRDGatewayPassword(String InheritRDGatewayPassword) {
        this.InheritRDGatewayPassword = InheritRDGatewayPassword;
    }

    public String getInheritRDGatewayDomain() {
        return InheritRDGatewayDomain;
    }

    public void setInheritRDGatewayDomain(String InheritRDGatewayDomain) {
        this.InheritRDGatewayDomain = InheritRDGatewayDomain;
    }

    @Override
    public ArrayList<Node> getNodes() {
        return nodes;
    }

    @Override
    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }
    @Override
    public void addNodes(Node novoNode){
        this.nodes.add(novoNode);
    }
    
    @Override
    public String toString(){
        return "Nome :" + Name + " host :"+ Hostname;
    }
    @Override
    public Iterator<Node> createIterator(){
      if(iterator == null){  
           if(nodes.isEmpty()) iterator =  new NullIterator();
           iterator = new NodeCompositeIterator(nodes.iterator());
      }     
      return iterator;     
    }
    
    public void print(){
        System.out.println(toString());
       Iterator<Node> iteratorPrint = nodes.iterator();
		while (iteratorPrint.hasNext()) {
			Node node = iteratorPrint.next();
                        System.out.print(toString()+"/");
			node.print();
		} 
    }
    /**
     * Cada Node do tipo connection é representado na forma da tag xml 
     * SessionData.
     * @param antecessor String do início da tag SessionData
     * @return linha com a parte final da tag SessionData
     */
    
    public String linha(String antecessor ){
        StringBuilder linha = new StringBuilder("");
        if(Type.equals("Connection")){
            linha.append(antecessor).append(Name).append("\" ");
            linha.append("SessionName=\"").append(Name).append("\" ");
            linha.append("ImageKey=\"").append("application_osx_terminal").append("\" "); 
            linha.append("Host=\"").append(Hostname).append("\" ");
            linha.append("Port=\"").append(Port).append("\" ");
            String Proto;
            /*
                Protocolos SP
                Raw
                Telnet
                Rlogin
                SSH
                Serial
                Cygterm
                Mintty

                Protocolos mR

                RDP
                VNC
                SSH1
                SSH2
                Telnet
                Rlogin
                RAW
                HTTP
                HTTPS
                ICA
                IntApp
            */
                      
            
            switch(Protocol){
                case "SSH1": Proto ="SSH";
                            break;
                case "SSH2": Proto ="SSH";
                            break;
                case "Rlogin": Proto ="Rlogin";
                            break;
                case "RAW": Proto ="Raw";
                            break;
                default: Proto ="Telnet";
                            break;
            }
            linha.append("Proto=\"").append(Proto).append("\" ");
            linha.append("PuttySession=\"").append("Default Settings").append("\" ");
            linha.append("Username=\"").append("").append("\" ");
            linha.append("ExtraArgs=\"").append("").append("\" />\n");   
            return linha.toString();
        } else {
            Iterator<Node> iteratorLinha = nodes.iterator();
            
		while (iteratorLinha.hasNext()) {
			Node node = iteratorLinha.next();
                        //constroi o SessionId de forma recursiva
                        linha.append(node.linha(antecessor + Name+ "/"));
                        
		} 
                return linha.toString();
        }
    }
}
