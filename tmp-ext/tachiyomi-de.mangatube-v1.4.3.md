# Extension Validation Report

- Extension: tachiyomi-de.mangatube-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6851437974515624757
- Source name: Manga Tube
- Source language: de
- Selected manga input: latest offset 0: Volcanic Age (`.../volcanic_age`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | One Piece (`.../one_piece`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Volcanic Age (`.../volcanic_age`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | Tales of Demons and Gods (`.../tales_of_demons_and_gods`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Volcanic Age (`.../volcanic_age`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Volcanic Age (`.../volcanic_age`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 240 | Vol. 1 Ch. 1 (`.../13435`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Volcanic Age, URL=`.../volcanic_age` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Volcanic Age, URL=`.../volcanic_age` at page 1 offset 0 and page 2 offset 7, title=All-Master Necromancer, URL=`.../all_master_necromancer` at page 1 offset 1 and page 2 offset 1, title=Release that Witch, URL=`.../release_that_witch` at page 1 offset 2 and page 2 offset 4, title=Revenge of the Baskerville Bloodhound, URL=`.../revenge_of_the_baskerville_bloodhound` at page 1 offset 3 and page 2 offset 3, title=Fairy Tail: 100 Years Quest, URL=`.../fairy_tail_100_years_quest` at page 1 offset 5 and page 2 offset 6, title=Tales of Demons and Gods, URL=`.../tales_of_demons_and_gods` at page 1 offset 6 and page 2 offset 0, title=One Piece, URL=`.../one_piece` at page 1 offset 7 and page 2 offset 2, title=Flying Witch, URL=`.../flying_witch` at page 1 offset 8 and page 2 offset 9, title=Boku Girl, URL=`.../boku_girl` at page 1 offset 9 and page 2 offset 10, title=Boruto: Two Blue Vortex, URL=`.../boruto_two_blue_vortex` at page 1 offset 10 and page 2 offset 13, title=Dead Rock, URL=`.../dead_rock` at page 1 offset 11 and page 2 offset 5 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 38/38 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 38/38 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://a.mtcdn.org/.../mid_37530a101c3ed2e493148b08b47308c5ac9d40e9.jpg` (image/jpeg, 12989 bytes, 151x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../volcanic_age` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://a.mtcdn.org/.../max_37530a101c3ed2e493148b08b47308c5ac9d40e9.jpg` (image/jpeg, 19609 bytes, 200x315) |  |  |  |
| details author | PASS | Jun Jeong |  |  |  |
| details artist | PASS | Tomassi |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Ein alter Mann, der als Kampfsportler nie viel erreicht hat, findet sich in einer Führungsposition wieder, weil alle Talente im großen Krieg der Kampfkünste gestorben sind. Am Ende seines Lebens erwacht er in seinem Körper aus der Zeit, als er noch ein Kind war. Ausgestattet mit Kenntnissen über geheime Techniken, zu denen nur der Anführer der Sekte Zugang hatte, trainiert er sich selbst und setzt Dinge in Bewegung, um zu verhindern, dass der kommende Krieg so viele Menschenleben fordert. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 240 chapters |  |  |  |
| chapter dates | PASS | 240 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://a.mtcdn.org/.../page_001_461cef.png` (image/png, 50492 bytes, 720x720) |  |  |  |
