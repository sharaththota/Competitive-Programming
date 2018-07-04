import unittest
def find_unique_delivery_id(ids):
    uids = {}
    dups = {}
    for id in ids:
        if id not in dups:
            if id in uids:
                del uids[id]
                dups[id] = True
            else:
                uids[id] = True
    for key in uids.keys():
        return key
    return None
    
