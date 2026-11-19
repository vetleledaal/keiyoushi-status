# Extension Validation Report

- Extension: tachiyomi-en.novelcrow-v1.6.61
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4344163117450761946
- Source name: NovelCrow
- Source language: en
- Selected manga input: popular offset 0: Sinful Lust – Tsumibukai yokubō [ZettoR18] (`.../27961`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Sinful Lust – Tsumibukai yokubō [ZettoR18] (`.../27961`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Just For You [MandoLogica] (`.../10723`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Bunny For Mommy [Lexx228] (`.../33907`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Black Halo [Flamesofavernus] (`.../35830`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sinful Lust – Tsumibukai yokubō [ZettoR18] (`.../27961`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 17 | 1 . Sinful Lust - Chapter 1 (`.../1-sinful-lust-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 89 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://novelcrow.com/.../Sinful-Lust-Chapter-1-350x476.webp` (image/webp (encoding: lossy), 22172 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `27961` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://novelcrow.com/.../Sinful-Lust-Chapter-1-193x278.webp` (image/webp (encoding: lossy), 11050 bytes, 193x278) |  |  |  |
| details author | PASS | Zetto |  |  |  |
| details artist | PASS | Zetto |  |  |  |
| details genres | PASS | Anal, Beauty Mark, Big Ass, Big Breasts, Blowjob, Bondage, Cheating, Cunnilingus, Daughter, FFM Threesome, Hairy, Hentai, Hidden Sex, Huge Breasts, Incest, Inseki, Kissing, MILF, Nakadashi / Creampie, Old Man, Stockings |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Old father wants to go for it one more time. He begs his thicc daughter and she accepts. He licks her pussy while she is preparing food in apron.<br><br>Incest hentai manga.<br><br>Chapter 6 FFM Threesome.<br><br>Chapter 7 Bondage<br><br>Support artist @<br><br>patreon.com/ZettoR18 x.com/zettonsfw |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 89 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://novelcrow.com/.../1---NovelCrow.webp` (image/webp (encoding: lossy), 76242 bytes, 1280x1687) |  |  |  |
