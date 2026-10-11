# Extension Validation Report

- Extension: tachiyomi-en.lilymanga-v1.6.62
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4480996639887718467
- Source name: Lily Manga
- Source language: en
- Selected manga input: popular offset 0: My Food Seems To Be Very Cute (`.../6955`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | My Food Seems To Be Very Cute (`.../6955`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | Falling (`.../11419`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 12 | The Guy She Was Interested in Wasn’t a Guy at All (Ki ni Natteru Hito ga Otoko ja Nakatta) (`.../8343`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Asagiiro no Saudade (`.../11474`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | My Food Seems To Be Very Cute (`.../6955`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Food Seems To Be Very Cute (`.../6955`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 261 | Episode 00 - Notice (`.../episode-00`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 2 |  |  | 10s+ |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Food Seems To Be Very Cute, URL=`6955` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lilymanga.net/.../My-Food-Seems-To-Be-Very-Cute-GL-Manhua-350x476.webp` (image/webp (encoding: lossy), 42524 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `6955` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lilymanga.net/.../My-Food-Seems-To-Be-Very-Cute-GL-Manhua-193x278.webp` (image/webp (encoding: lossy), 18690 bytes, 193x278) |  |  |  |
| details author | PASS | Radish |  |  |  |
| details artist | PASS | Radish |  |  |  |
| details genres | PASS | Fantasy, Shoujo Ai, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A vampire who has been sleeping for nearly two hundred years, Maria is awakened by a passing werewolf girl by a chance, and the moment the coffin is opened, the curse falls on the werewolf girl. The two girls set foot on the journey to the city.<br><br>Raw: BiliBili<br><br><br><br>Alternative Names: My Food Seems to Be Very Cute; Wo De Shiwu Kan Qilai Hen Ke Ai; Wǒ de Shíwù Kàn Gǐlái Hěn Kě'ài; 我的食物看起来很可爱 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 261 chapters |  |  |  |
| chapter dates | PASS | 261 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lilymanga.net/.../001---LilYManga.webp` (image/webp (encoding: lossy), 426948 bytes, 500x11411) |  |  |  |
