package at.triply.wcmodel.model

class OrderLinks(val self: List<SelfLink>,
                 val collection: List<CollectionLink>,
                 val customer: List<CustomerLink>)