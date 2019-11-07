package org.webdriver.patatiumwebui.pageObject;
import org.webdriver.patatiumwebui.utils.BaseAction;
import org.webdriver.patatiumwebui.utils.Locator;

import java.io.IOException;
public class LoginPage extends BaseAction {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/java/org/webdriver/patatiumwebui/pageObjectConfig/UILibrary.xml";
 public   LoginPage() {
//工程内读取对象库文件
	setXmlObjectPath(path);
getLocatorMap();
}
/***
* 用户名
* @return
* @throws IOException
*/
public Locator 用户名输入框() throws IOException
 {
   Locator locator=getLocator("用户名输入框");
   return locator;
 }

/***
* 密码
* @return
* @throws IOException
*/
public Locator Tab() throws IOException
{
    Locator locator=getLocator("Tab");
    return locator;
}
public Locator 密码输入框() throws IOException
 {
   Locator locator=getLocator("密码输入框");
   return locator;
 }

/***
* 登录
* @return
* @throws IOException
*/
public Locator 登录按钮() throws IOException
 {
   Locator locator=getLocator("登录按钮");
   return locator;
 }
}