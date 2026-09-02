# Extension Validation Report

- Extension: tachiyomi-en.myhentaigallery-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7327582601422280123
- Source name: MyHentaiGallery
- Source language: en
- Selected manga input: popular offset 0: The Joy Of Breeding (`.../20251`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 23 | The Joy Of Breeding (`.../20251`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 23 | Suzie Q - Breeding Mount (`.../27424`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 23 | Coco The Ceo (`.../62579`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 23 | Muscle Date 4 (`.../62556`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Joy Of Breeding (`.../20251`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Joy Of Breeding (`.../20251`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../20251`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 39 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Joy Of Breeding, URL=`.../20251` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 93/93 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 93/93 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.myhentaicomics.com/.../001_11.jpg <redacted query values: 22>` (image/jpeg, 40977 bytes, 350x490) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../20251` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.myhentaicomics.com/.../001_11.jpg <redacted query values: 22>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Ghettoyouth |  |  |  |
| details genres | PASS | Bukkake, Femdom, Anal, Most Popular, Harem, Pregnant \| Impregnation, Foot Fetish, Legendary, Tomboy, Artist: Ghettoyouth, Parody: Don't Toy With Me Miss Nagatoro \| Ijiranaide Nagatoro-San |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Groups:<br>- Western<br><br>Parodies:<br>- Don't Toy With Me Miss Nagatoro \| Ijiranaide Nagatoro-San |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.myhentaicomics.com/.../001_11.jpg <redacted query values: 22>` (image/jpeg, 423000 bytes, 1280x1804) |  |  |  |
