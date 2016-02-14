package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Arrays;
import my.product;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Startup village</title>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Google Fonts -->\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("       <link href=\"css2/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"css2/form.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        @decimal-format myNum{\r\n");
      out.write("            grouping-separator :\",\";\r\n");
      out.write("            decimal-seoarator: \".\"\r\n");
      out.write("        }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("   \r\n");
      out.write(" <!--   <div class=\"header-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <div class=\"user-menu\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user\"></i> My Account</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-heart\"></i> Wishlist</a></li>\r\n");
      out.write("                            <li><a href=\"cart.html\"><i class=\"fa fa-user\"></i> My Cart</a></li>\r\n");
      out.write("                            <li><a href=\"checkout.html\"><i class=\"fa fa-user\"></i> Checkout</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user\"></i> Login</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"header-right\">\r\n");
      out.write("                        <ul class=\"list-unstyled list-inline\">\r\n");
      out.write("                            <li class=\"dropdown dropdown-small\">\r\n");
      out.write("                                <a data-toggle=\"dropdown\" data-hover=\"dropdown\" class=\"dropdown-toggle\" href=\"#\"><span class=\"key\">currency :</span><span class=\"value\">USD </span><b class=\"caret\"></b></a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li><a href=\"#\">USD</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">INR</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">GBP</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"dropdown dropdown-small\">\r\n");
      out.write("                                <a data-toggle=\"dropdown\" data-hover=\"dropdown\" class=\"dropdown-toggle\" href=\"#\"><span class=\"key\">language :</span><span class=\"value\">English </span><b class=\"caret\"></b></a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li><a href=\"#\">English</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">French</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">German</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End header area -->\r\n");
      out.write("    \r\n");
      out.write("   <!-- <div class=\"site-branding-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                 \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <!--<div class=\"col-sm-6\">\r\n");
      out.write("                    <div class=\"shopping-item\">\r\n");
      out.write("                        <a href=\"cart.html\">Cart - <span class=\"cart-amunt\">$100</span> <i class=\"fa fa-shopping-cart\"></i> <span class=\"product-count\">5</span></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End site branding area -->\r\n");
      out.write("    \r\n");
      out.write("   <div class=\"mainmenu-area\" style=\"background-color: #0099CC;padding: 8px 8px 8px 8px;\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div> \r\n");
      out.write("                 \r\n");
      out.write("            <!--</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>  <!-- End mainmenu area -->\r\n");
      out.write("    \r\n");
      out.write("    <!--<div class=\"mainmenu-area\" style=\"background-color: #fff\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">-->\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"navbar-collapse collapse\" style=\"\">\r\n");
      out.write("                         \r\n");
      out.write("                    \r\n");
      out.write("                    <form method=\"GET\" action=\"myresults\">\r\n");
      out.write("                        \r\n");
      out.write("                       <!-- <h1 style=\"font-family: 'Open Sans';color: #5a88ca;padding:10px 10px 10px 10px; \">SV E-Commerce</h1>-->\r\n");
      out.write("                       <h1> <span class=\"logo\" style=\"padding-top: 0px;font-family: 'Open Sans';color:#fff;font-size: 25px\"> SV E-Commerce</span></h1>\r\n");
      out.write("                            <input type=\"submit\" value=\"Search\" style=\"float:right;background-color:#66CCFF\" onsubmit=\"myresults\">\r\n");
      out.write("                            \r\n");
      out.write("                            <input type=\"text\" class=\"\" style=\"width:50%;float:right;\" placeholder=\"Search products...\" name=\"search\">\r\n");
      out.write("                            \r\n");
      out.write("                        </form>\r\n");
      out.write("                        \r\n");
      out.write("                </div> \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("                <div class=\"col-md-12\" style=\"padding: 10px 10px 10px 10px;margin-left:7.5% \">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"navbar-collapse collapse\" style=\"\">\r\n");
      out.write("                         \r\n");
      out.write("                        ");

                            String search = request.getParameter("search");
                            String str= search.replaceAll(" ", "+");
                            String ll = request.getParameter("from");
                            String ul = request.getParameter("to");
                            product[] pr = (product[])request.getAttribute("products");
                            
      out.write("\r\n");
      out.write("                    <form method=\"GET\" action=\"myresults\">\r\n");
      out.write("                        \r\n");
      out.write("                       <!-- <h1 style=\"font-family: 'Open Sans';color: #5a88ca;padding:10px 10px 10px 10px; \">SV E-Commerce</h1>-->\r\n");
      out.write("                       <label>Amazon&nbsp;:&nbsp;</label><input type=\"checkbox\" value=\"amazon\" name=\"chk\" />\r\n");
      out.write("                    <label>Flipkart&nbsp;:&nbsp; </label><input type=\"checkbox\" value=\"flipkart\" name=\"chk\" />\r\n");
      out.write("                    <label>SnapDeal&nbsp;:&nbsp;</label> <input type=\"checkbox\" value=\"snapdeal\" name=\"chk\" />\r\n");
      out.write("                    <input type=\"hidden\" id=\"thisField\" name=\"search\" value=\"");
      out.print(str);
      out.write("\">\r\n");
      out.write("                        <label>Sort&nbsp;:&nbsp;</label> <select name=\"sort\">\r\n");
      out.write("                             <option value=\"rr\">\r\n");
      out.write("                                 High to Low\r\n");
      out.write("                             </option>\r\n");
      out.write("                             <option value=\"or\">\r\n");
      out.write("                                 Low to High\r\n");
      out.write("                             </option>\r\n");
      out.write("                         </select>\r\n");
      out.write("                        <label>Filter&nbsp;: </label>\r\n");
      out.write("                        <input type=\"text\" name=\"from\" class=\"\" placeholder=\"From..\" style=\"\"/>\r\n");
      out.write("                        <label>to</label>\r\n");
      out.write("                        <input type=\"text\" name=\"to\" class=\"\" placeholder=\"To...\" style=\"\"/>\r\n");
      out.write("                        <input type=\"submit\" Value=\"Filter\" onsubmit=\"myresults\"/>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div> \r\n");
      out.write("                </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"single-product-area\">\r\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("        ");

        if(ul ==null && ll == null){ ul=pr[0].getPRICE();ll=pr[pr.length-1].getPRICE();}
        String chk[] = request.getParameterValues("chk");
        
        for(int i=0;i<pr.length;i++)
        {
            String pri = pr[i].getPRICE();
            String re = pr[i].getREVIEW();
            String rat = pr[i].getRATING();
            String pa = pr[i].getP();
            String ti = pr[i].getTITLE();
            String src= pr[i].getSRC();
            String link = pr[i].getLINK();
            int o =Integer.parseInt(pri) ;
            int upl = Integer.parseInt(ul);
            int lol =Integer.parseInt(ll);
            if(o<=upl && o>=lol  && Arrays.asList(chk).contains(pa)){
        
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                 <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                     <div class=\"single-product\"  style=\"height: 320px;padding: 20px 20px 20px 20px\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"product-carousel-price\" style=\"padding-bottom:  20%;font-size: 14px;height: 30%\">\r\n");
      out.write("                                            <a href=\" \" style=\"font-size: 14px;\" >");
      out.print(ti);
      out.write("</a><br/><span>");
      out.print( rat);
      out.write(" out of 5 </span><br/>\r\n");
      out.write("                                            <span class=\"myNum\">");
      out.print( pri);
      out.write("</span>\r\n");
      out.write("                           <!-- <ins></ins> <del>Rs. getprice</del>-->\r\n");
      out.write("                        </div>  \r\n");
      out.write("                           <div class=\"single-shop-product\">\t\t\r\n");
      out.write("                        <div class=\"product-upper\" style=\"float: center;\">\r\n");
      out.write("                            <img src=\"");
      out.print(src);
      out.write(" \"  style=\"position: absolute;margin: auto;top: 30%;bottom: 0;left: 0;right: 0\" alt=\"\">\r\n");
      out.write("                             <div class=\"product-hover\">\r\n");
      out.write("                                 <a href=\"");
      out.print(link);
      out.write("\" class=\"add-to-cart-link\" target=\"_blank\"><i class=\"fa\">\r\n");
      out.write("                                         ");
 if(pa == "flipkart"){
      out.write("\r\n");
      out.write("                                         <img src=\"img/flip.png \" style=\"width: 65px;height: 25px;\" /></i></a>\r\n");
      out.write("                                         ");

                                             } else if(pa == "snapdeal"){
      out.write("\r\n");
      out.write("                                             <img src=\"img/SD.png \" style=\"width: 65px;height: 25px;\" /></i></a>\r\n");
      out.write("    ");
 }else if(pa=="amazon"){ 
      out.write("\r\n");
      out.write("                             <img src=\"img/amzo.png \" style=\"width: 65px;height: 25px;\" /></i></a>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("                             \r\n");
      out.write("                                             \r\n");
      out.write("                                        <a href=\"");
      out.print(link);
      out.write("\" class=\"view-details-link\" ><i class=\"fa fa-link\">ADD TO CART</i> </a>\r\n");
      out.write("                                       \r\n");
      out.write("                                               \r\n");
      out.write("                             </div>\r\n");
      out.write("                                        \r\n");
      out.write("                        </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     <!--   <div class=\"product-option-shop\">\r\n");
      out.write("                            <a class=\"add_to_cart_button\" data-quantity=\"1\" data-product_sku=\"\" data-product_id=\"70\" rel=\"nofollow\" href=\"/canvas/shop/?add-to-cart=70\">Add to cart</a>\r\n");
      out.write("                        </div>  -->                     \r\n");
      out.write("                    </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                           ");
}
                                }

      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"product-pagination text-center\">\r\n");
      out.write("                        <nav>\r\n");
      out.write("                         <!-- <ul class=\"pagination\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                              <a href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("                                <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("                              </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"#\">1</a></li>\r\n");
      out.write("                            <li><a href=\"#\">2</a></li>\r\n");
      out.write("                            <li><a href=\"#\">3</a></li>\r\n");
      out.write("                            <li><a href=\"#\">4</a></li>\r\n");
      out.write("                            <li><a href=\"#\">5</a></li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                              <a href=\"#\" aria-label=\"Next\">\r\n");
      out.write("                                <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("                              </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                          </ul>-->\r\n");
      out.write("                        </nav>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <!-- <div class=\"footer-top-area\">\r\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-about-us\">\r\n");
      out.write("                        <h2>u<span>Stora</span></h2>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>\r\n");
      out.write("                        <div class=\"footer-social\">\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-youtube\"></i></a>\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-linkedin\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-menu\">\r\n");
      out.write("                        <h2 class=\"footer-wid-title\">User Navigation </h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"\">My account</a></li>\r\n");
      out.write("                            <li><a href=\"\">Order history</a></li>\r\n");
      out.write("                            <li><a href=\"\">Wishlist</a></li>\r\n");
      out.write("                            <li><a href=\"\">Vendor contact</a></li>\r\n");
      out.write("                            <li><a href=\"\">Front page</a></li>\r\n");
      out.write("                        </ul>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-menu\">\r\n");
      out.write("                        <h2 class=\"footer-wid-title\">Categories</h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"\">Mobile Phone</a></li>\r\n");
      out.write("                            <li><a href=\"\">Home accesseries</a></li>\r\n");
      out.write("                            <li><a href=\"\">LED TV</a></li>\r\n");
      out.write("                            <li><a href=\"\">Computer</a></li>\r\n");
      out.write("                            <li><a href=\"\">Gadets</a></li>\r\n");
      out.write("                        </ul>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-newsletter\">\r\n");
      out.write("                        <h2 class=\"footer-wid-title\">Newsletter</h2>\r\n");
      out.write("                        <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>\r\n");
      out.write("                        <div class=\"newsletter-form\">\r\n");
      out.write("                            <input type=\"email\" placeholder=\"Type your email\">\r\n");
      out.write("                            <input type=\"submit\" value=\"Subscribe\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>-->\r\n");
      out.write("   <div class=\"footer-bottom-area\" style=\"margin-top: 3%;height: 80px;background-color: #5a88ca\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <div class=\"copyright\">\r\n");
      out.write("                        <p>&copy; 2015 uCommerce. All Rights Reserved. <a href=\"http://www.freshdesignweb.com\" style=\"color:white\" target=\"_blank\">freshDesignweb.com</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"footer-card-icon\">\r\n");
      out.write("                      <!--  <i class=\"\"><img src=\"img/amzo.png\" style=\"height:40px;width: 40px;padding-top: 2%\" /></i>\r\n");
      out.write("                        <i class=\"\"><img src=\"img/flip.png\" style=\"height:40px;width: 40px;padding-top: 2%\" /></i>\r\n");
      out.write("                        <i class=\"\"><img src=\"img/SD.png\" style=\"height:40px;width: 40px;padding-top: 2%\" /></i>\r\n");
      out.write("                        <!--<i class=\"fa fa-cc-visa\"></i>-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End footer bottom area -->\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    <!-- Latest jQuery form server -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap JS form CDN -->\r\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- jQuery sticky menu -->\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.sticky.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- jQuery easing -->\r\n");
      out.write("    <script src=\"js/jquery.easing.1.3.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Main Script -->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
