# Extension Validation Report

- Extension: tachiyomi-en.readonepunchmanmangaonlinetwo-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 23
- Lint: 4
- Warnings: 1
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8254209929759906152
- Source name: Read One-Punch Man Manga Online
- Source language: en
- Selected manga input: popular offset 0: Bug Ego (`https://ww7.readopm.com/.../bug-ego`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 9 | Bug Ego (`https://ww7.readopm.com/.../bug-ego`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Bug Ego (`https://ww7.readopm.com/.../bug-ego`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Bug Ego (`https://ww7.readopm.com/.../bug-ego`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 23 | Bug Ego Chapter 1 (`https://ww7.readopm.com/.../bug-ego-chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 68 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bug Ego, URL=`https://ww7.readopm.com/.../bug-ego` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 10/10 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww7.readopm.com/.../bug-ego`, popular entry 2: `https://ww7.readopm.com/.../one-punch-man-colored`, popular entry 3: `https://ww7.readopm.com/.../eyeshield-21` |  |  |  |
| thumbnail URLs | LINT | 0/10 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://ww7.readopm.com/.../bug-ego` |  |  |  |
| details thumbnail URL | PASS | `https://ww7.readopm.com/.../Read-One-Punch-Man-Manga-1-270x300.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS |  “Bug Ego” Manga by One Punch Man(WEB) Mangaka ” ONE” Makoto Hitsujiya transfers to a new high school and meets a strange classmate named Takehiro Kokudou. Kokudou introduces him to Bugs, a variety of phenomena that produces certain outcomes only if specific sequential actions are performed. The phenomena can range from bird droppings appearing on a sidewalk after pressing a certain combination of vending machine buttons to being able to lift weights beyond one’s normal physical limits. Gradually, Hisujiya and Kokudou’s friendship grows as they take advantage of the handy—and sometimes outrageous—conditions to activate Bugs that transcend the laws of science and humanity. Following Kokudou’s footsteps, Hitsujiya becomes addicted to triggering these anomalies. But when he discovers a bizarre set of conditions required for a ridiculous Bug that can change his future, his curiosity may have serious consequences.  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 23 chapters |  |  |  |
| chapter dates | PASS | 23 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 23 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.readopm.com/.../2.jpeg` (image/jpeg, 168173 bytes, 850x1200) |  |  |  |
