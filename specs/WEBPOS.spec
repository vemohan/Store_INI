Verify WEBPOS is enabled by default
====================================

This story is to use a single store.ini key called "Enable" to configure WebPOS 
Previously, store.ini was having two keys - Interface_Enabled and Translator_Enabled keys to enable or disable WEBPOS.
Now, these two keys are replaced by a single key "Enabled"
WebPos can be enabled or disabled using "Enabled" key in store ini

Read STORE.INI
---------------
tags:STORE_INI

* Read STORE.INI file

Verify WebPOS section in STORE.INI
-----------------------------------
In this scenario, WEBPOS section within STORE.INI is verified.
User can verify the Enabled key is present in STOREINI under WebPOS section
By default the Enabled Key is set to Yes 

tags: WebPos Section

*  WebPOS section in STOREINI

Verify Interface_Enabled and Translator_Enabled keys are removed
-----------------------------------------------------------------
tags: Interface , Translator keys

* Interface_enabled Keys are removed
* Translator_enabled Keys are removed

