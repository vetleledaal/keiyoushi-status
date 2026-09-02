# Extension Validation Report

- Extension: tachiyomi-th.cat300-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6055828959180481405
- Source name: Cat300
- Source language: th
- Selected manga input: popular offset 0: สงครามแห่งกามราคะ Silent War (`.../8762`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | สงครามแห่งกามราคะ Silent War (`.../8762`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Hero Villain (`.../35360`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | คุณนายอารมณ์เปลี่ยว กับเพื่อนบ้านพร้อมสนอง | [Aoi Hitori] Tonari no Oku-san ~Kanojo wa Furin Taishitsu~ Kouhen (Web Comic Toutetsu Vol. 16) (`.../71191`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | ซิสเตอร์กับก็อบลิน | [Tuna Mayonnaise (tsuyomayo)] Bakunyuu Sister x Kyokon Goblin | Big breasts sister X big dick goblin (`.../71150`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | สงครามแห่งกามราคะ Silent War (`.../8762`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | สงครามแห่งกามราคะ Silent War (`.../8762`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 162 | 149 (`.../149`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 37 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=สงครามแห่งกามราคะ Silent War, URL=`8762` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cat-300.com/.../001-150-175x238.jpg` (image/jpeg, 9590 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `8762` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cat-300.com/.../001-150-193x278.jpg` (image/jpeg, 12088 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Webtoon, นมใหญ่, นักเรียน, ภาพสี |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 162 chapters |  |  |  |
| chapter dates | LINT | 33 of 162 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=33 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cat-300.com/.../Silent-War_0.jpg` (image/png, 821401 bytes, 800x2746; server Content-Type: image/jpeg) |  |  |  |
