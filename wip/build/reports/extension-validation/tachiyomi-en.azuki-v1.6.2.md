# Extension Validation Report

- Extension: tachiyomi-en.azuki-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8195282477201261072
- Source name: Omoi
- Source language: en
- Selected manga input: popular offset 0: Fort of Apocalypse (`.../fort-of-apocalypse`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Fort of Apocalypse (`.../fort-of-apocalypse`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | How to Grill Our Love (`.../how-to-grill-our-love`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Tsuyo-Girl: Taking Charge (`.../tsuyo-girl-taking-charge`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Ayako (`.../ayako`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Fort of Apocalypse (`.../fort-of-apocalypse`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Fort of Apocalypse (`.../fort-of-apocalypse`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 49 | Chapter 1 (`.../13ec64b4-23bd-4a21-82d6-7fa51a183797`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 68 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Fort of Apocalypse, URL=`fort-of-apocalypse#c3995065-fb23-482d-9804-68d335cf90a9` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://production.image.azuki.co/.../800_2-3.jpg` (image/jpeg, 204608 bytes, 800x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `fort-of-apocalypse#c3995065-fb23-482d-9804-68d335cf90a9` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://production.image.azuki.co/.../2400_2-3.webp` (image/webp (encoding: lossy), 656898 bytes, 2400x3600) |  |  |  |
| details author | PASS | Yuu Kuraishi, Kazu Inabe |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Sci-Fi, Horror, Shonen, Mystery |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Yoshiaki Maeda has been falsely accused and detained, along with delinquents from all over the Kanto region, in the juvenile correctional facility, Shouran Institute. Yoshiaki is as typical as a boy can get, so when he finds himself living in this violence-ridden prison, he can’t think of anything worse. His cellmates, Iwakura, Yamanoi, and Yoshioka, are a cunning crew and soon Yoshiaki finds himself pulled into a feud going on in the prison. Then suddenly, a prison van crashes into the facility and what shambles out of the wreckage are flesh-eating zombies… And so the curtain is raised on this bone-chilling story of panic and horror!<br><br>Alternative Titles:<br>アポカリプスの砦 <br><br>Some later volumes of this series will no longer be available through Omoi Premium starting January 1, 2026, due to licensing restrictions. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 49 chapters |  |  |  |
| chapter dates | LINT | 29 of 49 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=29 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://production.image-content.azuki.co/.../1600.webp <redacted query values: drm>` (image/webp (encoding: lossy), 399476 bytes, 1600x2400) |  |  |  |
