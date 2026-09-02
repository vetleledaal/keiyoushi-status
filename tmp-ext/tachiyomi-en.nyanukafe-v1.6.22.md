# Extension Validation Report

- Extension: tachiyomi-en.nyanukafe-v1.6.22
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3025454996745441538
- Source name: Nyanu Kafe
- Source language: en
- Selected manga input: popular offset 0: Demon Lord City (`.../63f559b92c0`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 4 | Demon Lord City (`.../63f559b92c0`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 6 | Too Many Losing Heroines! (`.../062ed884e41`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Demon Lord City (`.../63f559b92c0`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Demon Lord City (`.../63f559b92c0`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 22 | Chapter 0 - Prologue (`.../63f559b92c0-63fe09027fb`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 4 entries |  |  |  |
| latest listing | PASS | 6 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Demon Lord City, URL=`.../63f559b92c0` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 11/11 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 11/11 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url and w>` (image/png, 616844 bytes, 480x534) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../63f559b92c0` |  |  |  |
| details thumbnail URL | PASS | `https://wsrv.nl <redacted query values: url and w>` |  |  |  |
| details author | PASS | Rocket Shoukai |  |  |  |
| details artist | PASS | Sakura Ion |  |  |  |
| details genres | PASS | Comic, Mystery, Magic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | In the "Demon City" where humans and demons coexist, one of the seven demon kings is murdered. In order to solve the case, Alsarisa, the daughter of a hero who enforces justice under the law, teams up with Keed, a bad investigator who values honour over the law. In a world swirling with violence and conspiracy, the unconventional investigation drama of the two twisted people begins. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 22 chapters |  |  |  |
| chapter dates | PASS | 22 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../Zf4AGT_U5P7` (image/webp (encoding: lossy), 452260 bytes, 1080x1502; server Content-Type: text/plain) |  |  |  |
