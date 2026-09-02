# Extension Validation Report

- Extension: tachiyomi-en.kmanga-v1.6.7
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 32
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8143442163119480220
- Source name: K Manga
- Source language: en
- Selected manga input: latest offset 0: Even the Student Council Has Its Holes! (`.../10685`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Shangri-La Frontier (`.../10011`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | A Sign of Affection (`.../10520`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 12 | Even the Student Council Has Its Holes! (`.../10685`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Even the Student Council Has Its Holes! (`.../10685`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Even the Student Council Has Its Holes! (`.../10685`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 183 | CHAPTER 1 EVEN HIGH SCHOOL BOYS HAVE THEIR HOLES… (`.../364014`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Even the Student Council Has Its Holes!, URL=`.../10685` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.kmanga.kodansha.com/.../title_grid_square_202604061426256bf6624f3381bb7bd704457e06aa43e5.png` (image/png, 106965 bytes, 320x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../10685` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.kmanga.kodansha.com/.../banner_20260406142625f4eb3a36ed9afde313a469acc3ab2ca1.png` (image/png, 205315 bytes, 640x368) |  |  |  |
| details author | PASS | Muchimaro |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Gag･Comedy･Slice-of-Life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | These student council members are all over the place! Each one of them is eccentric in their own way—one’s an airhead, one’s just plain frightening, one’s a closet pervert, but all in all, they’re really just weird! And yet it’s everyone’s oddities that makes them endearing and what allows them to create their new normal. Get ready for a slice-of-life manga that’s irresistibly charming, quirky, and a little bit naughty! " Translation by Susamaji, Lettering by Jan Lan Ivan Concepcion, Editing by Sarah Tilson, KPS Products Corp..../YKS Services LLC<br><br>Japanese Title: 生徒会にも穴はある！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 183 chapters |  |  |  |
| chapter dates | PASS | 183 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.kmanga.kodansha.com/.../d2c48d779ac573a23d07506f1c8b6bb23d8bc0e9f74189b2cf9934ad45834676.jpg <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 460232 bytes, 960x1378) |  |  |  |
