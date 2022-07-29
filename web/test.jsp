<%-- 
    Document   : test
    Created on : 29 Jun, 2022, 10:45:38 PM
    Author     : Anju
--%>

<%String qid = (String) session.getAttribute("q_id");%>
       <tbody>

                                   <%
                                        String Selq = "select *from question a inner join subject b on a.sub_id=b.sub_id inner join department c on b.dep_id=c.dep_id inner join user d on d.dep_id=c.dep_id where user_id='"+qid+"'";
                                        ResultSet rs = obj.select(Selq);

                                      while (rs.next()) {
                                          String id = rs.getString("q_id");
//                                      String name = rs.getString("sub_name");

                                 %>
                                    <tr>
                                         <td>
                                            <p class="text-xs font-weight-bold mb-0"><%=id%></p>
                                        </td>

                                        <td class="align-middle">
                                           
                                            <a href="sel_ans.jsp?qid=<%=id%>" class="btn btn-sm btn-danger">ADD OPTIONS</a>

                                        </td>
                                    </tr>
                           //         <% }%>
                           //    

    
</tbody>