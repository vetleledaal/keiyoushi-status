# Extension Validation Report

- Extension: tachiyomi-th.thaimanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 6145049378633382077
- Source name: ThaiManga
- Source language: th
- Selected manga input: popular offset 0: Medical Return (`.../medical-return`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Medical Return (`.../medical-return`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 40 | Teisou Gyakuten Sekai de Yuiitsu no Otoko Kishi no Ore, Onna Kishi Gakuen ni Nyuugaku Shitara Nazeka Eiyou Atsukai Sareta: Zetsurin Skill de Harem Musou (`.../teisou-gyakuten-sekai-de-yuiitsu-no-otoko-kishi-no-ore-onna-kishi-gakuen-ni-nyuugaku-shitara-nazeka-eiyou-atsukai-sareta-zetsurin-skill-de-harem-musou`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | Tsuiraku JK to Haijin Kyoushi (`.../tsuiraku-jk-to-haijin-kyoushi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Blue Lock (`.../blue-lock`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Medical Return (`.../medical-return`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Medical Return (`.../medical-return`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 149 | ตอนที่ 0 (`.../medical-return-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Medical Return, URL=`.../medical-return` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.thaimanga.net/.../02374c29ec4fbbac6dd9ef99edc24d0c_Medical-Return-1.jpg` (image/jpeg, 187357 bytes, 1000x1350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../medical-return` |  |  |  |
| details thumbnail URL | PASS | `https://www.thaimanga.net/.../02374c29ec4fbbac6dd9ef99edc24d0c_Medical-Return-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Fantasy, Manhwa, School life, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 149 chapters |  |  |  |
| chapter dates | PASS | 149 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.thaimanga.net/.../SDLJU3CFNH-1642318929.jpg` (image/jpeg, 563275 bytes, 720x11763) |  |  |  |
