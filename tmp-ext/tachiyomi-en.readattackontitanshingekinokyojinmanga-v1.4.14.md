# Extension Validation Report

- Extension: tachiyomi-en.readattackontitanshingekinokyojinmanga-v1.4.14
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
- Source ID: 8930801332831394412
- Source name: Read Attack on Titan Shingeki no Kyojin Manga
- Source language: en
- Selected manga input: popular offset 0: Shingeki No Kyojin (`https://ww12.readsnk.com/.../shingeki-no-kyojin`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 14 | Shingeki No Kyojin (`https://ww12.readsnk.com/.../shingeki-no-kyojin`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Shingeki No Kyojin (`https://ww12.readsnk.com/.../shingeki-no-kyojin`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Shingeki No Kyojin (`https://ww12.readsnk.com/.../shingeki-no-kyojin`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 144 | Shingeki No Kyojin Chapter 0 (`https://ww12.readsnk.com/.../shingeki-no-kyojin-chapter-0`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 69 |  |  | <1s |

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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shingeki No Kyojin, URL=`https://ww12.readsnk.com/.../shingeki-no-kyojin` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 15/15 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww12.readsnk.com/.../shingeki-no-kyojin`, popular entry 2: `https://ww12.readsnk.com/.../shingeki-no-kyojin-colored`, popular entry 3: `https://ww12.readsnk.com/.../shingeki-no-kyojin-before-the-fall` |  |  |  |
| thumbnail URLs | LINT | 0/15 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://ww12.readsnk.com/.../shingeki-no-kyojin` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../XDcjemc.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Hundreds of years ago, horrifying creatures which resembled humans appeared. These mindless, towering giants, called “titans,” proved to be an existential threat, as they preyed on whatever humans they could find in order to satisfy a seemingly unending appetite. Unable to effectively combat the titans, mankind was forced to barricade themselves within large walls surrounding what may very well be humanity’s last safe haven in the world. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 144 chapters |  |  |  |
| chapter dates | LINT | All 144 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=144 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 144 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 69 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.readsnk.com/.../2.jpeg` (image/jpeg, 429078 bytes, 785x1200) |  |  |  |
