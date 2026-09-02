# Extension Validation Report

- Extension: tachiyomi-en.readtokyoghoulretokyoghoulmangaonline-v1.4.12
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
- Source ID: 6468833665354206027
- Source name: Read Tokyo Ghoul Re & Tokyo Ghoul Manga Online
- Source language: en
- Selected manga input: popular offset 0: Tokyo Ghoul (`https://ww12.tokyoghoulre.com/.../tokyo-ghoul`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Tokyo Ghoul (`https://ww12.tokyoghoulre.com/.../tokyo-ghoul`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | Tokyo Ghoul (`https://ww12.tokyoghoulre.com/.../tokyo-ghoul`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tokyo Ghoul (`https://ww12.tokyoghoulre.com/.../tokyo-ghoul`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 145 | Tokyo Ghoul Chapter 0 (`https://ww12.tokyoghoulre.com/.../tokyo-ghoul-chapter-0`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 37 |  |  | <1s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tokyo Ghoul, URL=`https://ww12.tokyoghoulre.com/.../tokyo-ghoul` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 12/12 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww12.tokyoghoulre.com/.../tokyo-ghoul`, popular entry 2: `https://ww12.tokyoghoulre.com/.../tokyo-ghoul-jack`, popular entry 3: `https://ww12.tokyoghoulre.com/.../tokyo-ghoulre-colored` |  |  |  |
| thumbnail URLs | LINT | 0/12 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://ww12.tokyoghoulre.com/.../tokyo-ghoul` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../LGjBype.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Lurking within the shadows of Tokyo are frightening beings known as “ghouls,” who satisfy their hunger by feeding on humans once night falls. An organization known as the Commission of Counter Ghoul (CCG) has been established in response to the constant attacks on citizens and as a means of purging these creatures. However, the problem lies in identifying ghouls as they disguise themselves as humans, living amongst the masses so that hunting prey will be easier. Ken Kaneki, an unsuspecting university freshman, finds himself caught in a world between humans and ghouls when his date turns out to be a ghoul after his flesh. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 145 chapters |  |  |  |
| chapter dates | LINT | All 145 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=145 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 145 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.tokyoghoulre.com/.../02.jpeg` (image/jpeg, 330364 bytes, 1364x2100) |  |  |  |
