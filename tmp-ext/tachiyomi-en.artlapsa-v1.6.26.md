# Extension Validation Report

- Extension: tachiyomi-en.artlapsa-v1.6.26
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 734404203508686053
- Source name: Art Lapsa
- Source language: en
- Selected manga input: popular offset 0: i was a slave warrior but-the dragon who saved me says i’m his fated mate (`.../b1877591-9bb8-4c0d-912b-8249063c5d62`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | i was a slave warrior but-the dragon who saved me says i’m his fated mate (`.../b1877591-9bb8-4c0d-912b-8249063c5d62`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 862 | That Genius is Obsessed With His Fake Girlfriend (`.../bb730f89-8b12-4686-a170-0f4a6272be11`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | i was a slave warrior but-the dragon who saved me says i’m his fated mate (`.../b1877591-9bb8-4c0d-912b-8249063c5d62`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | i was a slave warrior but-the dragon who saved me says i’m his fated mate (`.../b1877591-9bb8-4c0d-912b-8249063c5d62`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 38 | Chapter 01 (`.../51776ad1-d37a-439c-a2ef-8c7910cf3b04`) |  | <1s |
| pages | `getPageList(chapter)` | success | 51 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 862 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=i was a slave warrior but-the dragon who saved me says i’m his fated mate, URL=`.../b1877591-9bb8-4c0d-912b-8249063c5d62` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 875/875 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 875/875 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://artlapsa.com/.../300x450.webp <redacted query values: w>` (image/webp (encoding: lossy), 83886 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../b1877591-9bb8-4c0d-912b-8249063c5d62` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Josei, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | “From Slave Warrior to Fated Mate – An Unexpected Encounter That Changes Destiny!”She lived her life in hell, nothing more than a tool for battle, forced to fight in brutal arenas day after day, with no hope of freedom.One day, a mighty warrior from the dragon race arrives on a mission to destroy the illegal fighting ring. As he watches her fight for survival, he feels something unexplainable—she is his fated mate, the one destined for him by fate!What seemed like a mere coincidence soon becomes a turning point in both their lives, as destiny begins to weave their fates together, changing everything.Can freedom and love await her after a lifetime of suffering?A thrilling romantic fantasy about a battle-hardened slave girl and a dragon warrior who sees her as more than just a fighter—he sees his destined partner!<br><br>Alternative Titles:<br>- 元戦闘用奴隷ですが、助けてくれた竜人は番だそうです。<br>- Moto Sentouyou Dorei desu ga, Tasukete Kureta Ryuu Hito wa Banda Sou desu. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 38 chapters |  |  |  |
| chapter dates | LINT | All 38 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=38 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://artlapsa.com/.../001.jpg` (image/jpeg, 1502361 bytes, 1352x1922) |  |  |  |
