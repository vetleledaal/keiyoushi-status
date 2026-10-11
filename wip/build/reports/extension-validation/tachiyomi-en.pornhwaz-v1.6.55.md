# Extension Validation Report

- Extension: tachiyomi-en.pornhwaz-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: madara
- Source ID: 2311025425739352818
- Source name: Pornhwaz
- Source language: en
- Selected manga input: popular offset 0: Moby Dick (`.../1112`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Moby Dick (`.../1112`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | I’m the Only Man on the Military Base (`.../1473`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | KinkFolder.ZIP (`.../7181`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Cleaning Service (`.../1809`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Moby Dick (`.../1112`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Moby Dick (`.../1112`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 108 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 30 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Moby Dick, URL=`1112` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.pornhwaz.com/.../Moby-Dick-Manhwa-Online-175x238.webp` (image/webp (encoding: lossy), 10318 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1112` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.pornhwaz.com/.../Moby-Dick-Manhwa-Online-193x278.webp` (image/webp (encoding: lossy), 12780 bytes, 193x278) |  |  |  |
| details author | PASS | Yansae |  |  |  |
| details artist | PASS | Yansae |  |  |  |
| details genres | PASS | Adult, Drama, Fantasy, Mature, Romance, Smut |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | One day, the broke Hoonsang receives a mysterious business card that completely changes his life. The card takes him to Bannam-dong, a city known as the cheating city, and grants him unimaginable wealth. But there’s a catch —<br><br>“You will be a ‘gift’ to the VIPs. Give them pleasure they can never forget.”<br><br>Now trapped in a world of luxury, deceit, and forbidden pleasure, Hoonsang’s new life is far darker than he ever imagined.<br><br>Read Moby Dick Manhwa Online, also known as 모비딕, is a Korean webtoon released in 2023. Written and illustrated by Yansae, this free premium manhwa explores a mix of Drama, Fantasy, Mature, and Romance genres, with an engaging storyline and striking artwork.<br><br>Read Pornhwa Moby Dick Manhwa Chapters in English Online – only at pornhwaz.com<br><br>Stay up to date with the latest Moby Dick Webtoon chapters and explore a huge library of popular Manhwas and Korean comics online for free.<br><br>Browse 1000+ Manhwas and Webtoons online for free at pornhwaz.com. Read popular Manhwa, full-color Korean comics, and free premium Manhwa in English. New Manhwa chapters are updated hourly on pornhwaz.com — follow now to get instant updates on the latest Manhwa releases.<br><br>Alternative Names: 慾海交鋒 / 모비딕 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 108 chapters |  |  |  |
| chapter dates | LINT | 107 of 108 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=107 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.pornhwaz.com/.../001.webp` (image/webp (encoding: lossy), 307548 bytes, 720x6122) |  |  |  |
