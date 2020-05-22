
Exercises Core tag library functionality.

Also Demonstrates access works to/from the WEB-INF private area & the public WebContent area.
Demos how to start up going directly to WEB-INF private area:
       Start with welcome.jsp as welcome page:
       jsp:forward page = "/WEB-INF/JSPs/PrivateFacade.jsp 
       
       PrivateFacade.jsp access content from "public" area:
        <%@ include file="../../PrivateFacadeContent.jsp"  %>
        
        


