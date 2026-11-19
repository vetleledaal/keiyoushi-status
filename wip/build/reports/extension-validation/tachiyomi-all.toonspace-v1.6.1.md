# Extension Validation Report

- Extension: tachiyomi-all.toonspace-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 1664744658092918162
- Source name: ToonSpace
- Source language: en
- Selected manga input: popular offset 0: Culture Shock (`.../culture-shock`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Culture Shock (`.../culture-shock`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Roadside Temptation (`.../roadside-temptation`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | Wish You Were Dead (`.../wish-you-were-dead`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Culture Shock (`.../culture-shock`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Culture Shock (`.../culture-shock`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 19 | Episode 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Culture Shock, URL=`culture-shock` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://toonspace-static.fra1.cdn.digitaloceanspaces.com/.../IMG_8841_kopiya_5dc4c8967c.jpg` (image/jpeg, 1629852 bytes, 1500x2682) |  |  |  |
| details identity | PASS | Details preserved selected URL `culture-shock` |  |  |  |
| details thumbnail URL | PASS | `https://toonspace-static.fra1.cdn.digitaloceanspaces.com/.../IMG_8841_kopiya_5dc4c8967c.jpg` |  |  |  |
| details author | PASS | Toon Space |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Young Kevin was both excited and nervous about his upcoming exchange trip to the warm African country of Kulanda. This journey offered him a chance to explore a new culture and reinvent himself, free from labels as a nerdy outcast. However, he worried that the vibrant culture, which his kind hostess Amara and her lovely daughters Zuri and Nala were eager to share, might be... overwhelming. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | PASS | 19 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://toonspace-static.fra1.cdn.digitaloceanspaces.com/.../1_9549d932e5.jpg` (image/jpeg, 5773959 bytes, 1000x11600) |  |  |  |
