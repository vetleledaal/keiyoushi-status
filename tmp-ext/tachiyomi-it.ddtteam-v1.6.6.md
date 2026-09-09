# Extension Validation Report

- Extension: tachiyomi-it.ddtteam-v1.6.6
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: pizzareader
- Source ID: 4975929166626394514
- Source name: DDT Team
- Source language: it
- Selected manga input: latest offset 0: After school adventure (`.../after_school_adventure`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 324 | 1 or W (`.../1_or_w`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | After school adventure (`.../after_school_adventure`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | After school adventure (`.../after_school_adventure`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | After school adventure (`.../after_school_adventure`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Vol.1 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 221 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 324 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=After school adventure, URL=`.../after_school_adventure` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 335/335 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 335/335 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://ddt.hastateam.com/.../hasta_logo_red_rect.png` -> 2 manga URLs (examples: `.../brynhildr_nelloscurit`, `.../nobilt_contadina`) |  |  |  |
| thumbnail | PASS | `https://ddt.hastateam.com/.../After-School-Adventure---vol-1-000-Cover.jpg <redacted query values: v>` (image/jpeg, 104256 bytes, 283x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../after_school_adventure` |  |  |  |
| details thumbnail URL | PASS | `https://ddt.hastateam.com/.../After-School-Adventure---vol-1-000-Cover.jpg <redacted query values: v>` |  |  |  |
| details author | PASS | Takeshi Takebayashi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Tratto da MangaDB<br><br>Daiki Okuma, mentre stava cercando di dichiarare il suo amore alla bella Mami Fukuzawa, vede aprire davanti a se un varco dimensionale dal quale arrivano una ragazza ed un mostro che, durante il loro combattimento, riescono a ferire Mami.<br>Daiki viene informato dalla nuova arrivata, Selphy, che l'unico modo per salvare la ragazza è quello di portarla nel mondo dall'altra parte del portale. Lui accetta ma non senza conseguenze: il viaggio non è propriamente semplice e, all'arrivo, l'anima di Mami si ritrova nel corpo di Selphy e l'anima quest'ultima resiste come spirito visibile solamente a Daiki.<br>La scena che si para di fronte ai due studenti è disarmante. Il mondo nel quale arrivano è una realtà parallela alla loro Terra, ma semidistrutta. I pochi abitanti sopravvissuti vivono, senza sentimenti, in scuole fortezze dove imparano a combattere contro i mostri rakushasa, totalmente privi di intelligenza ma fortissimi e guidati dall'istinto.<br>Ai due ragazzi toccherà prima ambientarsi e poi trovare il modo per tornare alla loro casa. Nel farlo, ovviamente, riusciranno anche a capire l'origine dei mostri e quindi ad aiutare i terrestri alternativi a sconfiggerli.<br><br>Un misto tra fumetto fantasy, commedia scolastica condita da equivoci e fanservice. Il risultato finale è una serie senza capo né coda, che non riesce ad eccellere in nessuno dei suoi aspetti, senza quindi trovare una sua utilità, se non quella di passatempo per neofiti del manga. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 221 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ddt.hastateam.com/.../after_school_adventure__vol_1_000_cover.jpg <redacted query values: v>` (image/jpeg, 354377 bytes, 850x1200) |  |  |  |
