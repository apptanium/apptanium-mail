package com.apptanium.apps.mailserver.security;

/**
 * Created by sgupta on 12/28/14.
 */
public enum AuthScope {
  /**
   * From Gmail: Read all resources and their metadata—no write operations
   */
  ReadOnly,

  /**
   * From Gmail: All read/write operations except immediate,
   * permanent deletion of threads and messages, bypassing Trash
   */
  Modify,

  /**
   * From Gmail: Create, read, update, and delete drafts. Send messages and drafts
   */
  Compose,

  /**
   * From Gmail: Full access to the account, including permanent deletion of threads and messages.
   * This scope should only be requested if your application needs to
   * immediately and permanently delete threads and messages, bypassing Trash;
   * all other actions can be performed with less permissive scopes
   */
  Full,

  /**
   * View the list of connections for a user
   */
  GraphList,

  /**
   * request connections from others, or disconnect existing connections; includes the GraphList scope
   */
  GraphUpdate,
  ;


}
