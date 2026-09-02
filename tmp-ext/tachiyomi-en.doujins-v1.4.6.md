# Extension Validation Report

- Extension: tachiyomi-en.doujins-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 2
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3733450486998805728
- Source name: Doujins
- Source language: en
- Selected manga input: popular offset 0: Kouhai-chan's Counterattack (`.../jyuryokushi-tan-kouhai-chans-counterattack-102962`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 71 | Kouhai-chan's Counterattack (`.../jyuryokushi-tan-kouhai-chans-counterattack-102962`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Operation: Remedial Classes ~The Case of Ayako Nishi-sensei~ (`.../edo-shigezu-operation-remedial-classes-the-case-of-ayako-nishi-sensei-102971`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 9 | Astolfo Suddenly Goes Into Heat (`.../tamarantei-astolfo-suddenly-goes-into-heat-102851`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Kouhai-chan's Counterattack (`.../kouhai-chans-counterattack-102962`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kouhai-chan's Counterattack (`.../jyuryokushi-tan-kouhai-chans-counterattack-102962`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../jyuryokushi-tan-kouhai-chans-counterattack-102962`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 29 |  |  | <1s |

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
| popular listing | PASS | 71 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Kouhai-chan's Counterattack, URL=`.../kouhai-chans-counterattack-102962` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://static.doujins.com/.../f2-f89ntzq9.jpg <redacted query values: st and e> 2x` -> 2 manga URLs (examples: `.../jyuryokushi-tan-kouhai-chans-counterattack-102962`, `.../kouhai-chans-counterattack-102962`) |  |  |  |
| thumbnail | PASS | `https://static.doujins.com/.../f2-f89ntzq9.jpg <redacted query values: st and e> 2x` (image/jpeg, 51580 bytes, 364x520) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jyuryokushi-tan-kouhai-chans-counterattack-102962` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Jyuryokushi-tan |  |  |  |
| details artist | PASS | Jyuryokushi-tan |  |  |  |
| details genres | PASS | beauty mark, big ass, big breasts, bikini, collar, cow girl, gloves, pixie cut, stockings, swimsuit |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://static.doujins.com/.../n-vugpbka5.jpg <redacted query values: st and e>` (image/jpeg, 682647 bytes, 1274x1800) |  |  |  |
