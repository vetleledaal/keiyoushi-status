# Extension Validation Report

- Extension: tachiyomi-all.doujiva-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1868981745168096185
- Source name: Doujiva
- Source language: all
- Selected manga input: popular offset 0: [Sakamata Nerimono] HYPNO BLINK Ver.1.0 [English] [Digital] (`.../sakamata-nerimono-hypno-blink-ver10-english-digital-698237`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | [Sakamata Nerimono] HYPNO BLINK Ver.1.0 [English] [Digital] (`.../sakamata-nerimono-hypno-blink-ver10-english-digital-698237`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | [Nanao Yukiji] Naoshi no Asobi [Digital] (`.../nanao-yukiji-naoshi-no-asobi-digital-698242`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | COMIC LOE VOL. 29 LOE ナイルの恵み (`.../comic-loe-vol-29-loe-698579`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | [Chinkon-ya (Chinconta)] The Story of the Well-Rounded Girl Who Fell to a Giant Member [English] (`.../chinkon-ya-chinconta-the-story-of-the-well-rounded-girl-who-fell-to-a-giant-member-english-698463`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Sakamata Nerimono] HYPNO BLINK Ver.1.0 [English] [Digital] (`.../sakamata-nerimono-hypno-blink-ver10-english-digital-698237`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../cmwm5spo0wl9r01pbo9hzdxyj`) |  | <1s |
| pages | `getPageList(chapter)` | success | 201 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.doujiva.com/.../cover.webp` (image/webp (encoding: lossy), 20436 bytes, 700x992) |  |  |  |
| details identity | PASS | Details preserved selected URL `sakamata-nerimono-hypno-blink-ver10-english-digital-698237` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.doujiva.com/.../cover.webp` |  |  |  |
| details author | PASS | sakamata nerimono |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big breasts, glasses, emotionless sex, ahegao, x-ray, twintails, stockings, bondage, defloration, group, masturbation, ffm threesome, ponytail, shimaidon, anal, rape, anal intercourse, story arc, inverted nipples, bbm, bunny girl, tankoubon, maid, mind control, double penetration, mmf threesome, bloomers |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Pages: 201<br>Language: en<br>Type: MANGA<br>Source: nhentai |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 201 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.doujiva.com/.../001.webp` (image/webp (encoding: lossy), 107828 bytes, 1058x1500) |  |  |  |
