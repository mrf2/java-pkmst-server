/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import java.util.List;
import com.prokarma.pkmst.model.User;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2021-06-06T01:51:21.903Z")

@Api(value = "User", description = "the User API")
public interface UserApi {

    @ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createUser(@ApiParam(value = "Created user object" ,required=true )   @RequestBody User body, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/createWithArray",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createUsersWithArrayInput(@ApiParam(value = "List of user object" ,required=true )   @RequestBody List<User> body, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/createWithList",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createUsersWithListInput(@ApiParam(value = "List of user object" ,required=true )   @RequestBody List<User> body, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Delete user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true ) @PathVariable("username") String username, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get user by user name", notes = "", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing.",required=true ) @PathVariable("username") String username, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Logs user into the system", notes = "", response = String.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid username/password supplied") })
    @RequestMapping(value = "/user/login",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> loginUser(@ApiParam(value = "The user name for login", required = true)  @RequestParam(value = "username", required = true) String username,@ApiParam(value = "The password for login in clear text", required = true)  @RequestParam(value = "password", required = true) String password, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Logs out current logged in user session", notes = "", response = Void.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/logout",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> logoutUser( @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Updated user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid user supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUser(@ApiParam(value = "name that need to be updated",required=true ) @PathVariable("username") String username,@ApiParam(value = "Updated user object" ,required=true )   @RequestBody User body, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
