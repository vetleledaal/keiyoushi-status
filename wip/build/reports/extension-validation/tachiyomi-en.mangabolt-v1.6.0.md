# Extension Validation Report

- Extension: tachiyomi-en.mangabolt-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 2
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 286088605022156276
- Source name: MangaBolt
- Source language: en
- Selected manga input: popular offset 0: 7DS: Four Horsemen of the Apocalypse (`.../nanatsu-mokushiroku-no-yonkishi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 7DS: Four Horsemen of the Apocalypse (`.../nanatsu-mokushiroku-no-yonkishi`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Bleach (`.../bleach`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 4 | Blue Lock (`.../blue-lock`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 7DS: Four Horsemen of the Apocalypse (`.../nanatsu-mokushiroku-no-yonkishi`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 7DS: Four Horsemen of the Apocalypse (`.../nanatsu-mokushiroku-no-yonkishi`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 258 | 7DS: Four Horsemen of the Apocalypse Chapter 1 (`https://mangabolt.com/.../nanatsu-mokushiroku-no-yonkishi-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 72 |  |  | <1s |

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
| latest listing | PASS | 4 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=7DS: Four Horsemen of the Apocalypse, URL=`.../nanatsu-mokushiroku-no-yonkishi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://i.imgur.com/.../l5b3RwU.png` -> 4 manga URLs (examples: `.../another-blue-lock-episode-harajuku`, `.../another-blue-lock-episode-omotesando`, `.../aoku-somero`), `https://imagizer.imageshack.com/.../Osh3iX.png` -> 2 manga URLs (examples: `.../as-the-gods-will-the-second-series`, `.../as-the-gods-will-zero`), `https://i.imgur.com/.../QiM8PlY.png` -> 2 manga URLs (examples: `.../attack-on-titan-no-regrets`, `.../attack-on-titan-no-regrets-colored`), `https://i.imgur.com/.../kMUG4RX.png` -> 2 manga URLs (examples: `.../berserk`, `.../berserk-official-guidebook`), `https://i.imgur.com/.../PYTwMv4.png` -> 2 manga URLs (examples: `.../black-clover`, `.../black-clover-gaiden-quartet-knights`) |  |  |  |
| thumbnail | PASS | `https://i.imgur.com/.../PACGdUE.png` (image/png, 253730 bytes, 322x321) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../nanatsu-mokushiroku-no-yonkishi` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../PACGdUE.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Alternative name: Mokushiroku no Yonkishi The Four Horsemen of the Apocalypse 「黙示録の四人の騎士, Mokushiroku no shi-ri no kishi」are an extremely powerful group of four elite warriors of the Britannia's largest clans. It's main goal is to bring a new holy war to the world. All its members are children of the Seven Deadly Sins. In addition, everyone has peculiarities that set them apart from their clans. Each of them has a symbol embedded in his body, symbolizing which knight he is Each horsemen has a special ability, called the "Horse," which names them within the group. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 258 chapters |  |  |  |
| chapter dates | LINT | All 258 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=258 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 258 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 72 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.mangabolt.com/.../1.jpeg <redacted query values: t>` (image/jpeg, 296659 bytes, 1067x1600) |  |  |  |
