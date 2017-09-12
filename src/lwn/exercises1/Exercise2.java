package lwn.exercises1;

import java.util.ArrayList;

public class Exercise2 {
	// int LEN = 30;// 单词的长度
	// int NUM = 3665;// 单词的个数
	private static String[] words = { "wh", "is", "fat", "two", "this", "abandon", "ability", "abnormal", "aboard",
			"abroad", "absence", "absent", "absolute", "absolutely", "absorb", "abstract", "abundant", "abuse",
			"academic", "academy", "accelerate", "acceleration", "accent", "acceptable", "acceptance", "access",
			"accessory", "accident", "accidental", "accommodate", "accommodation", "accompany", "accomplish", "accord",
			"accordance", "accordingly", "account", "accumulate", "accuracy", "accurate", "accuse", "accustom",
			"accustomed", "achieve", "achievement", "acid", "acquaintance", "acquire", "acre", "act", "action",
			"active", "activity", "actress", "actually", "acute", "adapt", "add", "addition", "additional", "address",
			"adequate", "adjective", "adjust", "administration", "admire", "admission", "admit", "adopt", "advance",
			"advanced", "advantage", "adventure", "adverb", "advertisement", "advisable", "advise", "aeroplane",
			"affair", "affect", "affection", "afford", "African", "agency", "agent", "aggressive", "agony", "agreement",
			"agriculture", "aid", "aircraft", "airline", "airplane", "airport", "alarm", "alcohol", "allow", "alloy",
			"alone", "alphabet", "alter", "alternative", "although", "altitude", "altogether", "aluminium", "amaze",
			"ambition", "ambulance", "amongst", "amount", "ampere", "amplify", "amuse", "analyse", "analysis",
			"ancestor", "anchor", "ancient", "angel", "anger", "angle", "angry", "ankle", "announce", "announcer",
			"annoy", "annual", "anticipate", "anxiety", "anxious", "anyway", "apart", "apartment", "apologize",
			"apology", "apparatus", "apparent", "appeal", "appear", "appearance", "appetite", "appliance", "applicable",
			"application", "apply", "appoint", "appointment", "appreciate", "approach", "appropriate", "approval",
			"approve", "approximately", "Arabian", "arbitrary", "architecture", "argument", "arise", "arithmetic",
			"arouse", "arrangement", "arrest", "arrival", "arrive", "arrow", "artificial", "artist", "artistic", "ash",
			"ashamed", "asleep", "aspect", "assemble", "assembly", "assess", "assign", "assignment", "assist",
			"assistant", "associate", "association", "assume", "assure", "astonish", "astronaut", "athlete", "Atlantic",
			"atmosphere", "atmospheric", "atom", "atomic", "attach", "attack", "attain", "attempt", "attend",
			"attention", "attentive", "attitude", "attract", "attraction", "attractive", "attribute", "audience",
			"August", "aural", "Australia", "Australian", "author", "authority", "auto", "automatic", "automation",
			"automobile", "auxiliary", "available", "avenue", "average", "aviation", "avoid", "await", "awake", "award",
			"aware", "awful", "awfully", "awkward", "ax", "axis", "bacteria", "badminton", "baggage", "bake", "balance",
			"band", "bang", "banner", "bar", "barber", "bare", "bargain", "bark", "barn", "barrel", "barrier", "basic",
			"basically", "basin", "basis", "bat", "bath", "bathe", "bathroom", "battery", "battle", "bay", "B.C.",
			"beach", "beam", "bean", "bear", "bear", "beard", "beast", "beat", "beautiful", "beef", "beg", "beggar",
			"behalf", "behave", "behavior", "being", "belief", "believe", "bell", "belong", "beloved", "belt", "bench",
			"bend", "beneath", "beneficial", "benefit", "berry", "beside", "besides", "bet", "betray", "beyond",
			"Bible", "bill", "billion", "bind", "biology", "birthday", "biscuit", "bite", "bitter", "bitterly", "blade",
			"blame", "blank", "blanket", "blast", "blaze", "bleed", "blend", "bless", "blind", "block", "bloom",
			"blossom", "blow", "boast", "bold", "bolt", "bomb", "bond", "bone", "boot", "booth", "border", "bore",
			"born", "bosom", "boss", "bother", "bough", "bounce", "bound", "boundary", "bow", "bowl", "box", "brain",
			"brake", "branch", "brand", "brandy", "brass", "breadth", "breathe", "breed", "breeze", "brick", "brief",
			"brighten", "brilliant", "brim", "brisk", "bristle", "Britain", "British", "brittle", "broadcast", "broken",
			"bronze", "brood", "brook", "broom", "brow", "brown", "bruise", "brush", "brute", "bubble", "bucket", "bud",
			"bulb", "bulk", "bull", "bullet", "bunch", "bundle", "burden", "bureau", "burst", "bury", "butcher",
			"butter", "butterfly", "button", "cabbage", "cabin", "cabinet", "cable", "cafeteria", "calculate",
			"calculator", "calendar", "camel", "camera", "camp", "campaign", "campus", "Canada", "Canadian", "canal",
			"cancel", "cancer", "candidate", "candle", "candy", "cannon", "canoe", "canteen", "canvas", "capable",
			"capacity", "capital", "captain", "captive", "capture", "carbon", "care", "career", "careful", "careless",
			"cargo", "carpenter", "carpet", "carriage", "carrier", "carrot", "carry", "cart", "carve", "case", "case",
			"cash", "cassette", "cast", "castle", "casual", "catalog", "catch", "cathedral", "cattle", "cause", "cave",
			"cease", "ceiling", "celebrate", "cell", "cellar", "cement", "centigrade", "centimetre", "central",
			"centre", "century", "ceremony", "certainly", "certainty", "certificate", "chain", "challenge", "chamber",
			"champion", "chance", "change", "channel", "chapter", "character", "characteristic", "charge", "charity",
			"charming", "chart", "chase", "cheap", "cheat", "check", "cheek", "cheer", "cheerful", "cheese", "chemical",
			"chemist", "chemistry", "cheque", "cherry", "chess", "chest", "chew", "chicken", "chief", "childhood",
			"childish", "chill", "chimney", "chin", "china", "chocolate", "choice", "choke", "choose", "chop",
			"Christian", "Christmas", "cigarette", "cinema", "circuit", "circular", "circulate", "circumference",
			"circumstance", "citizen", "civil", "civilization", "civilize", "claim", "clap", "clarify", "clasp",
			"classical", "classification", "classify", "classmate", "classroom", "claw", "clay", "clean", "clear",
			"clearly", "clerk", "clever", "cliff", "climate", "climb", "cloak", "closely", "clothe", "clue", "clumsy",
			"coach", "coal", "coarse", "coast", "cock", "code", "coffee", "coil", "coin", "collapse", "collar",
			"colleague", "collect", "collection", "collective", "college", "collision", "colonel", "colony", "color",
			"column", "comb", "combination", "combine", "comfort", "comfortable", "command", "commander", "comment",
			"commerce", "commercial", "commission", "commit", "committee", "common", "commonly", "communicate",
			"communication", "communism", "communist", "community", "companion", "company", "comparative", "compare",
			"comparison", "compass", "compel", "compete", "competent", "competition", "compile", "complain",
			"complaint", "complete", "completely", "complex", "complicate", "complicated", "component", "compose",
			"composition", "compound", "comprehension", "comprehensive", "compress", "comprise", "compromise",
			"compute", "computer", "comrade", "conceal", "concentrate", "concentration", "concept", "concern",
			"concerning", "concert", "conclude", "conclusion", "concrete", "condemn", "condense", "condition",
			"conduct", "conductor", "conference", "confess", "confidence", "confident", "confine", "confirm",
			"conflict", "confuse", "confusion", "congratulate", "congratulation", "congress", "conjunction", "connect",
			"connection", "conquer", "conquest", "conscience", "conscious", "consciousness", "consent", "consequence",
			"consequently", "conservation", "conservative", "consider", "considerable", "considerate", "consideration",
			"consist", "consistent", "constant", "constitution", "construct", "construction", "consult", "consume",
			"consumption", "contact", "contain", "container", "contemporary", "contempt", "content", "content",
			"contest", "continent", "continual", "continue", "continuous", "contract", "contradiction", "contrary",
			"contrast", "contribute", "control", "convenience", "convenient", "convention", "conventional",
			"conversation", "conversely", "conversion", "convert", "convey", "convince", "cook", "cooperate",
			"coordinate", "cope", "copper", "copy", "cord", "cordial", "core", "corn", "corner", "corporation",
			"correct", "correction", "correspond", "correspondent", "corresponding", "corridor", "cost", "costly",
			"cottage", "cotton", "council", "count", "counter", "county", "course", "court", "cousin", "coward",
			"crack", "craft", "crane", "crash", "crawl", "crazy", "cream", "create", "creative", "creature", "credit",
			"creep", "crew", "cricket", "crime", "criminal", "cripple", "crisis", "critic", "critical", "criticism",
			"criticize", "crop", "crow", "crowd", "crown", "crude", "cruel", "crush", "crust", "crystal", "cube",
			"cubic", "cucumber", "cultivate", "culture", "cunning", "cupboard", "cure", "curiosity", "curious", "curl",
			"current", "curse", "curtain", "curve", "cushion", "custom", "customer", "cycle", "daily", "dairy", "dam",
			"damage", "damp", "dangerous", "daring", "darling", "dash", "data", "dawn", "deadly", "deal", "dear",
			"death", "debate", "debt", "decade", "decay", "deceit", "deceive", "December", "decent", "decide",
			"decision", "deck", "declare", "decorate", "decrease", "deduce", "deed", "deepen", "defeat", "defect",
			"defence", "defend", "define", "definite", "definitely", "definition", "degree", "delay", "delete",
			"delegation", "delicate", "delicious", "delight", "deliver", "delivery", "demand", "democracy",
			"democratic", "demonstrate", "dense", "density", "deny", "depart", "department", "departure", "depend",
			"dependent", "deposit", "depress", "depth", "derive", "descend", "describe", "description", "desert",
			"deserve", "design", "desirable", "desire", "despair", "desperate", "despise", "despite", "destination",
			"destroy", "destruction", "detail", "detect", "detection", "determination", "determine", "develop",
			"development", "device", "devil", "devise", "devote", "dew", "diagram", "dial", "dialect", "dialog",
			"diameter", "diamond", "diary", "dictate", "dictation", "dictionary", "differ", "difference", "different",
			"difficult", "difficulty", "digest", "digital", "diligent", "dim", "dimension", "dinner", "dip", "direct",
			"direction", "directly", "director", "dirt", "dirty", "disable", "disadvantage", "disagree", "disappear",
			"disappoint", "disaster", "disk", "discard", "discharge", "discipline", "disclose", "discourage",
			"discover", "discovery", "discuss", "disease", "disguise", "disgust", "dish", "dishonour", "dismiss",
			"disorder", "display", "disposal", "dispose", "displease", "dispute", "dissatisfy", "dissolve", "distance",
			"distant", "distinct", "distinction", "distinguish", "distress", "distribute", "distribution", "district",
			"disturb", "ditch", "dive", "diverse", "divide", "division", "divorce", "dock", "domestic", "donkey",
			"dorm", "dormitory", "dose", "dot", "doubt", "doubtful", "doubtless", "downward", "dozen", "draft", "drag",
			"dragon", "drain", "drama", "dramatic", "draw", "drawer", "drawing", "dread", "dream", "dress", "drift",
			"drill", "drink", "drip", "drop", "drought", "drown", "drug", "drum", "drunk", "dry", "due", "dull", "dumb",
			"dump", "durable", "duration", "during", "dwelling", "dye", "dying", "dynamic", "each", "eager", "eagle",
			"ear", "early", "earn", "earnest", "earthquake", "ease", "easily", "eastern", "echo", "economic",
			"economical", "economy", "edge", "edition", "editor", "educate", "education", "effect", "effective",
			"efficiency", "efficient", "effort", "elaborate", "elastic", "elbow", "elect", "election", "electric",
			"electrical", "electricity", "electron", "electronic", "electronics", "element", "elementary", "elephant",
			"elevator", "eliminate", "elimination", "else", "elsewhere", "embarrass", "embrace", "emerge", "emergency",
			"emit", "emotional", "emperor", "emphasis", "emphasize", "empire", "employ", "employee", "employer",
			"employment", "enclose", "encounter", "encourage", "endure", "enemy", "energy", "enforce", "engage",
			"engine", "engineer", "engineering", "enlarge", "enormous", "ensure", "entertain", "enthusiasm",
			"enthusiastic", "entire", "entitle", "entrance", "entry", "envelope", "environment", "envy", "equal",
			"equality", "equation", "equip", "equipment", "equivalent", "era", "erect", "error", "escape", "especially",
			"essay", "essential", "establish", "establishment", "estimate", "European", "evaluate", "evaporate", "eve",
			"even", "even", "event", "eventually", "ever", "evidence", "evident", "evil", "evolution", "evolve",
			"exactly", "exaggerate", "examination", "examine", "example", "exceed", "exceedingly", "excellent",
			"except", "exception", "excess", "excessive", "exchange", "excite", "exciting", "exclaim", "exclude",
			"exclusively", "excursion", "excuse", "execute", "executive", "exercise", "exert", "exhaust", "exhibit",
			"exhibition", "exist", "existence", "exit", "expand", "expansion", "expect", "expectation", "expense",
			"expensive", "experience", "experiment", "experimental", "expert", "explain", "explanation", "explode",
			"exploit", "explore", "explosion", "explosive", "export", "expose", "exposure", "express", "expression",
			"extend", "extension", "extensive", "extent", "exterior", "external", "extra", "extraordinary", "extreme",
			"extremely", "eyesight", "facility", "factor", "faculty", "fade", "Fahrenheit", "failure", "faint", "fair",
			"fairly", "faith", "faithful", "false", "fame", "familiar", "famine", "famous", "fan", "fan", "fancy",
			"fare", "farewell", "fashion", "fashionable", "fasten", "fatal", "fate", "father", "father-in-law",
			"fatigue", "fault", "faulty", "favour", "favourable", "favourite", "fear", "fearful", "feasible", "feast",
			"feather", "feature", "February", "federal", "fee", "feeble", "feed", "feedback", "feel", "feeling",
			"fellow", "female", "fence", "fertile", "fertilizer", "festival", "fetch", "fever", "fibre", "fiction",
			"fierce", "figure", "file", "fill", "film", "filter", "final", "finally", "finance", "financial", "find",
			"finding", "fine", "finger", "finish", "fireman", "firm", "first", "fish", "fisherman", "fist", "fit",
			"fix", "flag", "flame", "flare", "flash", "flat", "flat", "flavour", "fleet", "flesh", "flexible", "flight",
			"float", "flock", "flood", "flour", "flourish", "flow", "flower", "flu", "fluent", "fluid", "flush",
			"focus", "fold", "folk", "follow", "following", "fond", "food", "fool", "foolish", "forbid", "force",
			"forecast", "forehead", "foreign", "foreigner", "foremost", "forest", "forever", "forget", "forgive",
			"fork", "form", "formal", "formation", "former", "formula", "forth", "fortnight", "fortunate",
			"fortunately", "fortune", "forty", "forward", "found", "foundation", "fountain", "four", "fourteen",
			"fourth", "fox", "fraction", "fragment", "frame", "framework", "France", "frank", "freedom", "freely",
			"freeze", "freight", "French", "frequency", "frequent", "frequently", "fresh", "friction", "fridge",
			"friendly", "friendship", "frighten", "frog", "frontier", "frost", "frown", "fruit", "fruitful", "fry",
			"fuel", "fulfil", "full", "fun", "function", "fund", "fundamental", "funeral", "funny", "fur", "furious",
			"furnace", "furnish", "furniture", "further", "furthermore", "future", "gain", "gallery", "gallon", "game",
			"gang", "gap", "garage", "garbage", "gardener", "gas", "gaseous", "gasoline", "gasp", "gauge", "gay",
			"gaze", "general", "generally", "generate", "generation", "generator", "generous", "genius", "gentle",
			"gentleman", "gently", "genuine", "geography", "geometry", "germ", "German", "Germany", "gesture", "ghost",
			"giant", "glance", "glare", "glass", "glide", "glimpse", "glitter", "globe", "gloomy", "glorious", "glory",
			"glove", "glow", "glue", "goal", "golf", "goodness", "goods", "goose", "govern", "government", "governor",
			"gown", "grace", "graceful", "gracious", "grade", "gradual", "gradually", "graduate", "grain", "gramme",
			"grammar", "grammatical", "grand", "granddaughter", "grandfather", "grandmother", "grandson", "grant",
			"grape", "graph", "grasp", "grass", "grateful", "gratitude", "grave", "gravity", "gray", "greatly",
			"greedy", "Greek", "greenhouse", "greet", "greeting", "grey", "grieve", "grind", "grip", "groan", "grocer",
			"grocery", "gross", "growth", "guarantee", "guard", "guess", "guest", "guidance", "guide", "guilty", "gulf",
			"gum", "gunpowder", "gymnasium", "habit", "habitual", "haircut", "halt", "hamburger", "hammer", "handful",
			"handkerchief", "handle", "handsome", "handwriting", "handy", "hang", "happen", "happiness", "happy",
			"harbour", "harden", "hardship", "hardware", "hare", "harmful", "harmony", "harness", "harsh", "harvest",
			"haste", "hasten", "hasty", "hat", "hatch", "hate", "hateful", "hatred", "have", "hawk", "hay", "hazard",
			"headache", "heading", "headmaster", "headquarters", "heal", "health", "healthy", "heap", "heating",
			"heaven", "heavily", "hedge", "heel", "height", "heir", "helicopter", "hell", "helmet", "hence", "her",
			"herd", "hero", "heroic", "heroine", "hesitate", "highway", "hillside", "hint", "hire", "historical", "hit",
			"hobby", "hollow", "holy", "honesty", "honey", "honeymoon", "honour", "honourable", "hook", "hopeless",
			"horizon", "horizontal", "horn", "horror", "horse", "horsepower", "hospital", "host", "hostess", "hostile",
			"household", "housewife", "human", "humble", "humid", "humorous", "humour", "hunger", "hungry", "hunt",
			"hurry", "hurt", "husband", "hut", "hydrogen", "ice-cream", "ideal", "identical", "identify", "idiom",
			"idle", "i.e.", "ignorant", "ignore", "illegal", "illness", "illustrate", "illustration", "image",
			"imaginary", "imagination", "imagine", "imitate", "immediate", "immediately", "immense", "immigrant",
			"impact", "impatient", "implication", "imply", "import", "importance", "important", "impose", "impossible",
			"impress", "impression", "impressive", "imprison", "improve", "improvement", "inch", "incident", "incline",
			"include", "income", "incorrect", "increase", "increasingly", "indeed", "indefinite", "independence",
			"independent", "index", "India", "Indian", "indicate", "indication", "indifferent", "indignant", "indirect",
			"indispensable", "individual", "indoors", "industrial", "industrialize", "industry", "inefficient",
			"inevitable", "inexpensive", "infant", "infect", "infer", "inferior", "infinite", "influence",
			"influential", "inform", "information", "inhabit", "inhabitant", "inherit", "initial", "injection",
			"injure", "injury", "ink", "inn", "inner", "innocent", "无效", "inquire", "inquiry", "insect", "insert",
			"inside", "insist", "inspect", "inspection", "inspire", "install", "installation", "instance", "instant",
			"instantly", "instead", "instinct", "institute", "institution", "instruct", "instrument", "insufficient",
			"insult", "insurance", "insure", "intellectual", "intelligence", "intelligent", "intend", "intense",
			"intensity", "intensive", "intention", "intentional", "interaction", "interest", "interesting", "interfere",
			"interference", "interior", "intermediate", "internal", "international", "interpret", "interpretation",
			"interpreter", "interrupt", "interruption", "interval", "interview", "intimate", "introduce",
			"introduction", "invade", "invasion", "invent", "invention", "inventor", "invest", "investigate",
			"investigation", "investment", "invisible", "invitation", "involve", "inward", "iron", "irregular",
			"isolate", "issue", "Italian", "item", "jacket", "jail", "jam", "jam", "January", "jar", "jaw", "jazz",
			"jealous", "jet", "jewel", "jewish", "job", "join", "joint", "joke", "jolly", "journal", "journalist",
			"journey", "joy", "joyful", "judge", "judgement", "juice", "jump", "jungle", "junior", "jury", "justice",
			"justify", "keen", "keeper", "kettle", "keyboard", "kick", "kilogram", "kilometer", "kingdom", "kiss",
			"kitchen", "kite", "knee", "kneel", "knife", "knit", "knob", "knock", "knot", "knowledge", "label",
			"laboratory", "labour", "lace", "lack", "ladder", "lag", "lamb", "lame", "landing", "landlady", "landlord",
			"lane", "language", "lantern", "lap", "largely", "laser", "last", "lately", "Latin", "latter", "laughter",
			"launch", "laundry", "lavatory", "lawn", "lay", "layer", "layout", "lead", "lead", "leader", "leadership",
			"leading", "league", "leak", "lean", "leap", "learned", "learning", "least", "leather", "lecture", "legal",
			"legend", "leisure", "lemon", "length", "lens", "less", "lessen", "lesson", "lest", "level", "lever",
			"liable", "liar", "liberal", "liberate", "liberation", "liberty", "librarian", "library", "license", "lick",
			"lid", "lie", "lie", "lieutenant", "lighten", "lightly", "lightning", "like", "like", "likely", "likewise",
			"limb", "lime", "limit", "limitation", "limited", "linen", "liner", "link", "lip", "liquid", "liquor",
			"list", "listen", "listener", "liter", "literary", "literature", "little", "lively", "liver", "living",
			"living-room", "load", "loaf", "loan", "local", "locate", "lock", "locomotive", "lodge", "log", "logic",
			"logical", "lonely", "loop", "loose", "loosen", "lord", "lorry", "lose", "loss", "lot", "loud",
			"loudspeaker", "lovely", "lover", "lower", "loyal", "loyalty", "lucky", "luggage", "lumber", "lump",
			"luxury", "machine", "mad", "madam", "magazine", "magic", "magnet", "magnetic", "magnificent", "maid",
			"mail", "main", "mainly", "mainland", "maintain", "maintenance", "major", "majority", "male", "manage",
			"management", "manager", "mankind", "manly", "manner", "manual", "manufacture", "manufacturer", "many",
			"marble", "margin", "marine", "mark", "market", "marriage", "married", "marry", "marvelous", "Marxisim",
			"Marxist", "mask", "mass", "master", "masterpiece", "mat", "match", "match", "mate", "material",
			"materialism", "mathematical", "mathematics", "maths", "matter", "mature", "maximum", "mayor", "meadow",
			"mean", "mean", "meaning", "means", "meantime", "meanwhile", "measurable", "measure", "measurement",
			"mechanic", "mechanical", "mechanically", "mechanics", "medal", "medical", "medicine", "Mediterranean",
			"medium", "meeting", "melon", "melt", "member", "memorial", "memory", "mend", "mental", "mention", "menu",
			"merchant", "mercury", "Mercury", "mercy", "merely", "merit", "merry", "mess", "message", "messenger",
			"metal", "meter", "method", "metric", "microcomputer", "microphone", "microscope", "midday", "midnight",
			"midst", "might", "might", "mild", "military", "milk", "mill", "millimetre", "million", "mind", "mine",
			"miner", "mineral", "minimum", "minister", "ministry", "minor", "minority", "minus", "minute", "minute",
			"miracle", "mirror", "miserable", "mislead", "miss", "missile", "missing", "mission", "mist", "mistake",
			"mistress", "misunderstand", "mixture", "moan", "mobile", "mode", "model", "moderate", "modern", "modest",
			"modify", "moist", "moisture", "molecule", "monitor", "monthly", "monument", "mood", "moral", "moreover",
			"mortal", "mosquito", "mostly", "motion", "motivate", "motive", "motor", "mould", "mount", "mountain",
			"mourn", "mouse", "mouth", "mouthful", "movement", "mud", "muddy", "mug", "multiple", "multiply", "murder",
			"murderer", "muscle", "museum", "mushroom", "musical", "musician", "must", "mute", "mutter", "mutton",
			"mutual", "mysterious", "mystery", "nail", "naked", "namely", "nap", "narrow", "nasty", "nation",
			"national", "nationality", "native", "natural", "naturally", "nature", "naughty", "naval", "navigation",
			"navy", "neat", "necessarily", "necessary", "necessity", "neck", "necklace", "needle", "needless",
			"negative", "neglect", "Negro", "neighbour", "neighbourhood", "nephew", "nerve", "nervous", "nest",
			"network", "neutral", "never", "nevertheless", "newly", "niece", "night", "nineteen", "ninety", "ninth",
			"nitrogen", "noble", "noisy", "none", "nonsense", "normal", "normally", "northeast", "northwest",
			"noticeable", "noun", "November", "nuclear", "nucleus", "nuisance", "numerous", "nurse", "nursery", "nut",
			"nylon", "object", "object", "objection", "objective", "oblige", "observation", "observe", "observer",
			"obstacle", "obtain", "obvious", "occasion", "occasional", "occasionally", "occupation", "occupy", "occur",
			"occurrence", "ocean", "Oceania", "October", "odd", "odour", "offend", "offer", "office", "officer",
			"official", "omit", "onion", "opening", "opera", "operate", "operation", "operational", "operator",
			"opinion", "opponent", "opportunity", "oppose", "opposite", "oppress", "optical", "optimistic", "option",
			"optional", "orange", "orbit", "orchestra", "order", "orderly", "ordinary", "ore", "organ", "organic",
			"organism", "organization", "organize", "oriental", "origin", "original", "ornament", "orphan", "otherwise",
			"ought", "ounce", "outcome", "outdoor", "outdoors", "outlet", "outline", "outlook", "output", "outset",
			"outside", "outskirt", "outstanding", "outward", "outwards", "oven", "overall", "overcoat", "overcome",
			"overhead", "overlook", "overnight", "overseas", "overtake", "overtime", "owe", "owl", "ownership", "ox",
			"pacific", "pack", "package", "packet", "pad", "pail", "painful", "painter", "painting", "palm", "pan",
			"panda", "pane", "panel", "pant", "parade", "paradise", "paragraph", "parallel", "parcel", "parliament",
			"partial", "partially", "participate", "particle", "particular", "particularly", "partly", "partner",
			"passage", "passenger", "passion", "passive", "passport", "paste", "pastime", "pat", "patch", "path",
			"patience", "patient", "pattern", "pause", "pave", "pavement", "paw", "payment", "pea", "peach", "peak",
			"pear", "pearl", "peasant", "pebble", "peculiar", "peel", "peep", "penetrate", "peninsula", "penny",
			"pension", "pepper", "perceive", "percentage", "perfectly", "perform", "performance", "perfume",
			"permanent", "permanently", "permission", "permit", "persist", "personal", "personnel", "perspective",
			"persuade", "pessimistic", "petrol", "petroleum", "phase", "phenomenon", "philosopher", "philosophy",
			"phone", "photograph", "photographic", "phrase", "physical", "physician", "physicist", "physics", "pick",
			"picnic", "pie", "piece", "pierce", "pigeon", "pillar", "pillow", "pilot", "pin", "pinch", "pine", "pink",
			"pint", "pioneer", "pipe", "pipeline", "pistol", "pit", "pitch", "pitch", "plain", "plantation", "plaster",
			"plastic", "platform", "player", "pleasant", "pleasure", "plentiful", "plot", "plough", "pluck", "plug",
			"plunge", "plural", "poetry", "point", "poison", "poisonous", "pole", "pole", "police", "policeman",
			"policy", "polish", "polite", "political", "politician", "politics", "pollute", "pollution", "pond", "pop",
			"pop", "popular", "population", "porch", "pork", "porridge", "port", "portable", "porter", "portion",
			"portrait", "Portuguese", "position", "positive", "possess", "possession", "possibility", "possible",
			"possibly", "post", "post", "postage", "postman", "postpone", "pot", "potato", "potential", "pound",
			"pound", "pour", "poverty", "powder", "power", "powerful", "practical", "practically", "practice",
			"practise", "praise", "pray", "prayer", "precaution", "preceding", "precious", "precise", "precision",
			"predict", "preface", "preferable", "preference", "prejudice", "preliminary", "premier", "preparation",
			"prepare", "preposition", "prescribe", "presence", "present", "present", "present", "presently", "preserve",
			"president", "press", "pressure", "pretend", "pretty", "prevail", "prevent", "previous", "previously",
			"priest", "primarily", "primary", "prime", "primitive", "prince", "princess", "principal", "principle",
			"print", "prior", "prisoner", "private", "privilege", "probability", "probable", "problem", "procedure",
			"proceed", "process", "procession", "proclaim", "product", "production", "productive", "profession",
			"professional", "professor", "profit", "program", "progress", "progressive", "prohibit", "project",
			"prominent", "promise", "promising", "promote", "prompt", "pronoun", "pronounce", "pronunciation", "proof",
			"proper", "properly", "property", "proportion", "proportional", "proposal", "propose", "prospect",
			"prosperity", "prosperous", "protect", "protection", "protective", "protein", "protest", "proud", "provide",
			"provided", "province", "provision", "psychological", "publication", "publish", "pudding", "puff", "pull",
			"pulse", "pump", "punch", "punch", "punctual", "punishment", "pupil", "puppet", "purchase", "purely",
			"purify", "purity", "purple", "purpose", "purse", "pursue", "pursuit", "push", "puzzle", "qualify",
			"quality", "quantity", "quarrel", "quart", "quarter", "quarterly", "queer", "queue", "quick", "quicken",
			"quiet", "quilt", "quit", "quite", "quiz", "quotation", "quote", "rabbit", "race", "racial", "rack", "rack",
			"racket", "radar", "radiate", "radiation", "radioactive", "radioactivity", "radish", "radium", "radius",
			"rag", "rage", "raid", "rail", "railroad", "railway", "rain", "rainbow", "rainy", "raise", "rake", "range",
			"rank", "rare", "rarely", "rat", "rate", "ratio", "rational", "raw", "ray", "razor", "react", "reaction",
			"reader", "readily", "reading", "ready", "reality", "realm", "reap", "rear", "rear", "reasonable", "rebel",
			"rebellion", "recall", "receipt", "receive", "receiver", "recent", "recently", "reception", "recite",
			"recognition", "recognize", "recollect", "recommend", "recommendation", "record", "recorder", "recover",
			"recovery", "reduce", "reduction", "reed", "reel", "reference", "refine", "reflect", "reflection",
			"reflexion", "reform", "refresh", "refreshment", "refrigerator", "refuge", "refusal", "refute", "regard",
			"regarding", "regardless", "region", "register", "regret", "regular", "regularly", "regulate", "regulation",
			"rehearsal", "reign", "rein", "reinforce", "reject", "rejoice", "relate", "relation", "relationship",
			"relative", "relatively", "relativity", "relax", "release", "relevant", "reliability", "reliable",
			"reliance", "relief", "relieve", "religion", "religious", "reluctant", "rely", "remain", "remains",
			"remark", "remarkable", "remedy", "remember", "remind", "remote", "removal", "remove", "render",
			"repeatedly", "repent", "repetition", "replace", "reply", "represent", "representative", "reproach",
			"reproduce", "republic", "republican", "reputation", "request", "require", "requirement", "rescue",
			"research", "researcher", "resemble", "reserve", "reservior", "residence", "resident", "resign",
			"resignation", "resist", "resistance", "resistant", "resolution", "resolve", "resort", "resource",
			"respect", "respectful", "respective", "respectively", "respond", "response", "responsibility",
			"responsible", "restaurant", "restless", "restore", "restrain", "restraint", "restrict", "restriction",
			"result", "resume", "retain", "retell", "retire", "retreat", "reveal", "revenge", "reverse", "review",
			"revise", "revolt", "revolution", "revolutionary", "reward", "rhythm", "rib", "ribbon", "rid", "riddle",
			"ridge", "ridiculous", "rifle", "rigid", "ring", "ripe", "ripen", "risk", "rival", "roar", "roast", "rob",
			"robber", "robbery", "robe", "robot", "rock", "rocket", "rod", "roll", "roller", "Roman", "romantic",
			"root", "rot", "rotary", "rotate", "rotation", "rotten", "rough", "roughly", "round", "rouse", "route",
			"routine", "row", "row", "royal", "rub", "rubber", "rubbish", "rude", "rug", "ruin", "ruler", "rumour",
			"rural", "Russian", "rust", "rusty", "sack", "sacred", "sacrifice", "saddle", "sadly", "sadness", "safety",
			"sail", "sailor", "saint", "sake", "salad", "salary", "sale", "salesman", "salt", "salute", "sample",
			"sandwich", "sandy", "satellite", "satisfaction", "satisfactory", "satisfy", "sauce", "saucer", "sausage",
			"saving", "saw", "scale", "scan", "scar", "scarce", "scarcely", "scarf", "scatter", "scene", "scenery",
			"scent", "schedule", "scheme", "scholar", "scholarship", "scientific", "scientist", "scissors", "scope",
			"scorn", "scout", "scrape", "scratch", "scream", "screen", "screw", "seal", "seal", "seaman", "seaport",
			"secondary", "secondly", "secret", "secretary", "section", "secure", "security", "seed", "seek", "seize",
			"selection", "selfish", "sell", "seller", "semester", "semiconductor", "senate", "senior", "sense",
			"sensible", "sensitive", "sentence", "separate", "separately", "separation", "September", "sequence",
			"series", "seriously", "servant", "service", "session", "setting", "settle", "settlement", "severe",
			"severely", "sew", "shade", "shadow", "shady", "shake", "shallow", "shame", "shampoo", "shape", "share",
			"sharp", "sharpen", "sharply", "shave", "shear", "shed", "shed", "sheet", "shelf", "shell", "shelter",
			"shepherd", "shield", "shift", "shilling", "shiver", "shoot", "shortage", "shortcoming", "shortly", "shot",
			"shoulder", "shower", "shriek", "shrink", "sideways", "sigh", "sight", "sightseeing", "sign", "signal",
			"signature", "significance", "significant", "silence", "silent", "silver", "similar", "similarly", "simple",
			"simplicity", "simplify", "simply", "sin", "since", "sincere", "sing", "singer", "single", "singular",
			"sink", "site", "situation", "sketch", "ski", "skill", "skilled", "skillful", "skim", "skin", "skirt",
			"slam", "slave", "slavery", "sleeve", "slender", "slice", "slide", "slight", "slightly", "slip", "slipper",
			"slippery", "slit", "slogan", "slope", "slum", "sly", "smart", "smog", "smooth", "smoothly", "snowy",
			"soak", "soap", "sob", "sober", "so-called", "soccer", "social", "socialism", "socialist", "society",
			"sock", "soda", "soft", "solar", "soldier", "sole", "sole", "solely", "solemn", "solid", "soluble",
			"solution", "solve", "somehow", "sometime", "sometimes", "somewhat", "somewhere", "sophisticated", "sore",
			"sorrow", "sort", "soul", "sound", "sound", "soup", "sour", "source", "southeast", "southern", "southwest",
			"Soviet", "sow", "spacecraft", "spaceship", "spade", "span", "Spanish", "spare", "spark", "sparkle",
			"sparrow", "spear", "special", "specialist", "speciality", "specialize", "specially", "specific", "specify",
			"specimen", "spectacle", "speed", "spend", "sphere", "spider", "spill", "spin", "spirit", "spiritual",
			"spit", "splash", "splendid", "split", "spoil", "sponge", "sponsor", "spontaneous", "spoon", "spot",
			"spray", "spread", "spring", "spring", "springtime", "sprinkle", "spur", "spy", "square", "squeeze",
			"squirrel", "stab", "stability", "stable", "stable", "stack", "stadium", "stage", "stain", "staircase",
			"stake", "stale", "stamp", "stand", "standard", "standpoint", "startle", "starve", "state", "statement",
			"statesman", "static", "statistical", "statue", "status", "steadily", "steady", "steam", "steamer", "steep",
			"steer", "stem", "stern", "steward", "stewardess", "sticky", "stiff", "stiffen", "stimulate", "sting",
			"stir", "stitch", "stock", "stocking", "stomach", "stony", "stool", "stoop", "storage", "store", "storey",
			"stormy", "story", "stove", "straight", "strain", "stranger", "strap", "strategy", "straw", "strawberry",
			"stream", "strength", "strengthen", "stress", "stretch", "strictly", "strike", "string", "strip", "stripe",
			"stroke", "stroke", "strongly", "structural", "structure", "struggle", "stuff", "stumble", "stupid",
			"stype", "submarine", "submerge", "submit", "subsequent", "substance", "substantial", "substitute",
			"subtract", "suburb", "subway", "succeed", "success", "successful", "succession", "successive", "suck",
			"suffer", "sufficient", "sufficiently", "sugar", "suggestion", "suit", "suitable", "sulphur", "sum",
			"summarize", "summary", "sunrise", "sunset", "sunshine", "super", "superficial", "superior", "supermarket",
			"supplement", "supply", "support", "suppose", "supreme", "surface", "surgeon", "surgery", "surname",
			"surprise", "surprising", "surprisingly", "surrender", "surround", "surroundings", "survey", "survive",
			"suspect", "suspend", "suspicion", "sustain", "swallow", "swallow", "swamp", "swan", "swarm", "sway",
			"swear", "sweat", "sweater", "sweep", "sweet", "swell", "swift", "swing", "Swiss", "switch", "sword",
			"symbol", "sympathetic", "sympathize", "sympathy", "synthetic", "system", "systematic(al)", "tablet", "tag",
			"tailor", "tale", "talent", "tame", "tan", "tank", "tap", "tap", "tape", "target", "technical",
			"technician", "technique", "technology", "tedious", "teenager", "telegram", "telegraph", "telephone",
			"telescope", "television", "temper", "temperature", "temple", "temporary", "tempt", "temptation", "ten",
			"tenant", "tend", "tend", "tendency", "tender", "tennis", "tense", "tense", "tent", "term", "terminal",
			"terrible", "terrific", "territory", "terror", "test", "textile", "theatre", "theoretical", "theory",
			"thermometer", "thickness", "thief", "thirsty", "thorn", "thorough", "thoughtful", "thousand", "thread",
			"threat", "threaten", "thrill", "thrive", "throat", "throne", "throng", "throw", "thrust", "thumb",
			"thunder", "Thursday", "thus", "tick", "tide", "tidy", "tight", "timber", "timid", "tin", "tiny", "tip",
			"tip", "tire", "tired", "tissue", "title", "toast", "toast", "tobacco", "toe", "together", "toilet",
			"tolerance", "tolerate", "tomato", "tomb", "ton", "tone", "tongue", "torch", "torrent", "tortoise",
			"torture", "toss", "total", "touch", "tough", "tour", "tourist", "towel", "tower", "town", "trace", "track",
			"tractor", "trade", "tradition", "traditional", "traffic", "tragedy", "trail", "training", "traitor",
			"tram", "tramp", "transfer", "transform", "transformation", "transformer", "transistor", "translate",
			"translation", "transmission", "transmit", "transparent", "transport", "transportation", "trap", "travel",
			"tray", "treason", "treasure", "treat", "treatment", "treaty", "tremble", "tremendous", "trend", "trial",
			"triangle", "tribe", "trick", "trifle", "trim", "trip", "triumph", "troop", "tropical", "troublesome",
			"trousers", "truck", "truly", "trumpet", "trunk", "tub", "tube", "tuck", "Tuesday", "tuition", "tumble",
			"tune", "tunnel", "turbine", "turbulent", "turkey", "turn", "turning", "turnip", "tutor", "twelfth",
			"twentieth", "twenty", "twice", "twin", "twinkle", "twist", "typhoon", "typical", "typist", "tyre", "ugly",
			"ultimate", "ultimately", "umbrella", "unbearable", "uncertain", "uncomfortable", "unconscious", "uncover",
			"undergo", "undergraduate", "underground", "underline", "underneath", "understand", "understanding",
			"undertake", "undertaking", "undo", "undoubtedly", "uneasy", "unexpected", "unfair", "unfortunate",
			"unfortunately", "uniform", "union", "unique", "unit", "unite", "unity", "universal", "universe",
			"university", "unjust", "unkind", "unknown", "unlike", "unlikely", "unload", "unlucky", "unnecessary",
			"unpleasant", "unsatisfactory", "unstable", "unsuitable", "unusual", "unusually", "unwilling", "upright",
			"upset", "upside-down", "upstairs", "up-to-date", "urge", "urgent", "usage", "usual", "utility", "utilize",
			"utmost", "utter", "utter", "vacant", "vacation", "vacuum", "vague", "vain", "valid", "valley", "valuable",
			"value", "van", "vanish", "vanity", "vapour", "variable", "variation", "variety", "various", "vary", "vase",
			"vast", "vegetable", "vehicle", "veil", "velocity", "velvet", "venture", "verify", "version", "vertical",
			"very", "vessel", "vest", "veteran", "vex", "via", "vibrate", "vibration", "vice", "vice", "victim",
			"victorious", "victory", "video", "view", "viewpoint", "vigorous", "vine", "vinegar", "violence", "violent",
			"violet", "virtually", "virtue", "visible", "vision", "visitor", "visual", "vital", "vitamin", "vivid",
			"vocabulary", "voice", "volcano", "volleyball", "volt", "voltage", "volume", "voluntary", "vote", "voyage",
			"wage", "wage", "waggon", "waist", "wake", "waken", "wallet", "wander", "warmth", "warn", "waterfall",
			"waterproof", "wave", "wavelength", "wax", "way", "weaken", "weakness", "wealth", "wealthy", "weapon",
			"weary", "weather", "weave", "wedding", "Wednesday", "weed", "weep", "weigh", "weight", "welcome", "weld",
			"welfare", "well", "well", "well-known", "wheat", "wheel", "whilst", "whip", "whirl", "whisky", "whisper",
			"whistle", "white", "whitewash", "wholly", "wicked", "wide", "widely", "widen", "widespread", "widow",
			"width", "wing", "wipe", "wireless", "wisdom", "wish", "wit", "withdraw", "within", "withstand", "witness",
			"wolf", "wooden", "wool", "woollen", "workshop", "world-wide", "worm", "worse", "worship", "worthless",
			"worthwhile", "worthy", "wound", "wrap", "wreath", "wreck", "wrist", "writing", "wrong", "X-ray", "yawn",
			"yearly", "yell", "yellow", "yield", "youth", "youthful", "zeal", "zealous", "zebra", "zero", "zone",
			"that" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] word = {
				{ 't', 'h', 's', 's' }, 
				{ 'w', 'a', 't', 'i' }, 
				{ 'o', 'a', 'h', 'g' },
				{ 'f', 'g', 'd', 't' } };
		int n = word.length;
		int m = word[0].length;
		int maxLength = n > m ? m : n; // 最大字符长度
		ArrayList<String> newWords = new ArrayList<String>();
		int index = 1;
		for (String str : words) {

			if (str.length() <= maxLength) {
				newWords.add(str);
			}
		}

		wordPuzzle(newWords, word);

	}

	public static void wordPuzzle(ArrayList<String> word, char[][] matrix) {
		int n = matrix.length; // 矩阵行
		int m = matrix[0].length;// 矩阵列

		for (int i = 0; i < n; i++) { // 三元组(行，列，方向→)
			for (int j = 0; j < m; j++) {
				StringBuffer sb = new StringBuffer();
				int k = j + 1;
				sb.append(matrix[i][j]);
				while (k < m) {
					sb.append(matrix[i][k]);

					if (word.contains(sb.toString())) {
						System.out.println(sb.toString());
					}

					k++;
				}

			}
		}

		// 三元组(行，列，方向↘)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				StringBuffer sb = new StringBuffer();
				int k = i + 1;
				int q = j + 1;
				sb.append(matrix[i][j]);
				while (k < n && q < m) {
					sb.append(matrix[k][q]);

					if (word.contains(sb.toString())) {
						System.out.println(sb.toString());
					}
					q++;
					k++;
				}
			}
		}

		// 三元组(行，列，方向↓)
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				StringBuffer sb = new StringBuffer();
				int k = j + 1;
				sb.append(matrix[j][i]);
				while (k < m) {
					sb.append(matrix[k][i]);

					if (word.contains(sb.toString())) {
						System.out.println(sb.toString());
					}

					k++;
				}
			}
		}

		// 三元组(行，列，方向↙)
		for(int i = m - 1 ; i >= 0 ; i--){
			for(int j = 0 ; j < n ; j++){
				StringBuffer sb = new StringBuffer();
				int k = i - 1;
				int q = j + 1;
				sb.append(matrix[j][i]);
				while (k >= 0 && q >= 0 && q < n) {
					sb.append(matrix[k][i]);

					if (word.contains(sb.toString())) {
						System.out.println(sb.toString());
					}
					
					k--;
					q++;
				}
			}
		}

		// 三元组(行，列，方向←)
		for (int i = 0; i < n; i++) {
			for (int j = m - 1; j >= 0; j--) {
				StringBuffer sb = new StringBuffer();
				int k = j - 1;
				sb.append(matrix[i][j]);
				while (k >= 0) {
					sb.append(matrix[i][k]);

					if (word.contains(sb.toString())) {
						System.out.println(sb.toString());
					}

					k--;
				}
			}
		}

		// 三元组(行，列，方向↖)
		for (int i = 0; i < n; i++) {
			for(int j = 0 ; j < m; j++){
				StringBuffer sb = new StringBuffer();
				int k = j - 1;
				int q = i - 1;
				sb.append(matrix[i][j]);
				while (q >= 0 && k >= 0) {
					sb.append(matrix[q][k]);

					if (word.contains(sb.toString())) {
						System.out.println(sb.toString());
					}
					k--;
					q--;
				}
			}
		}

		// 三元组(行，列，方向↑)
		for (int i = 0; i < m; i++) {
			for (int j = n - 1; j >= 0; j--) {
				StringBuffer sb = new StringBuffer();
				int k = j - 1;
				sb.append(matrix[j][i]);
				while (k >= 0) {
					sb.append(matrix[k][i]);

					if (word.contains(sb.toString())) {
						System.out.println(sb.toString());
					}

					k--;
				}
			}
		}

		// 三元组(行，列，方向↗)
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < m; j++) {
				StringBuffer sb = new StringBuffer();
				int k = i - 1;
				sb.append(matrix[i][j]);
				while (k >= 0) {
					sb.append(matrix[k][i]);

					if (word.contains(sb.toString())) {
						System.out.println(sb.toString());
					}

					k--;
				}
			}
		}

	}

}
