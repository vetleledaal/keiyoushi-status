# Extension Validation Report

- Extension: tachiyomi-all.xcomic-v1.6.6
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.u
- Source ID: 1951931397842101209
- Source name: XCOMIC
- Source language: en
- Selected manga input: popular offset 0: The Greatest Estate Developer (`.../vg7ypp`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | The Greatest Estate Developer (`.../vg7ypp`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | Lost in the Cloud [Official] (`.../x6zear`) |  | <1s |
| latest | `getLatestUpdates(1)` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 35: Expected start of the object '{', but had 'n' instead at path: \$.data.get_comic_latestUploads<br>JSON input: {"data":{"get_comic_latestUploads":null}}<br> | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | The Greatest Estate Developer (`.../vg7ypp`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Greatest Estate Developer (`.../vg7ypp`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 172 | Chapter 1 (`.../bloxkwj`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 35: Expected start of the object '{', but had 'n' instead at path: \$.data.get_comic_latestUploads<br>JSON input: {"data":{"get_comic_latestUploads":null}}<br> | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | SKIP | Unexpected JSON token at offset 35: Expected start of the object '{', but had 'n' instead at path: \$.data.get_comic_latestUploads<br>JSON input: {"data":{"get_comic_latestUploads":null}}<br> |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Greatest Estate Developer, URL=`vg7ypp` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Unexpected JSON token at offset 35: Expected start of the object '{', but had 'n' instead at path: \$.data.get_comic_latestUploads<br>JSON input: {"data":{"get_comic_latestUploads":null}}<br> |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 92/92 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 92/92 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://xcomic.me/.../W90d2.webp` -> 3 manga URLs (examples: `vg7ypp`, `xwpb85`, `7avnp6`), `https://xcomic.me/.../zxD8x.webp` -> 10 manga URLs (examples: `8myp2`, `2vwrll`, `7aopwe`), `https://xcomic.me/.../aDwRW.webp` -> 4 manga URLs (examples: `zqw37b`, `ej8vqy`, `amaw5m`) |  |  |  |
| thumbnail | PASS | `https://xcomic.me/.../W90d2.webp` (image/webp (encoding: lossy), 67628 bytes, 300x397) |  |  |  |
| details identity | PASS | Details preserved selected URL `vg7ypp` |  |  |  |
| details thumbnail URL | PASS | `https://xcomic.me/.../W90d2.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Shounen, Action, Adaptation, Adventure, Comedy, Degeneratemc, Demons, Drama, Fantasy, Full Color, Historical, Isekai, Magic, Martial Arts, Master Servant, Monster Girls, Monsters, Mystery, Reincarnation, Romance, Super Power, Supernatural, Thriller, Time Travel, Violence, Webtoon |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Original**: Korean<br>**Translated**: English<br>**Publication**: 2021 - 2025<br>**Read Direction**: ⬇️ Top To Bottom<br><br>**Statistics**<br>**Follows**: 29409 · **Comments**: 27115 · **Chapters**: 172<br><br><br><br>---<br><br>When civil engineering student Suho Kim falls asleep reading a fantasy novel, he wakes up as a character in the book! Suho is now in the body of Lloyd Frontera, a lazy noble who loves to drink, and whose family is in a mountain of debt. Using his engineering knowledge, Suho designs inventions to avert the terrible future that lies in wait for him. With the help of a giant hamster, a knight, and the world’s magic, can Suho dig his new family out of debt and build a better future?<br><br>**External Links**:<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../series.html <redacted query values: id>)<br>- \[MyAnimeList\](https://myanimelist.net/.../147272)<br>- \[Anime-Planet\](https://www.anime-planet.com/.../the-greatest-estate-developer)<br>- \[AniList\](https://anilist.co/.../140407)<br>- \[Kitsu\](https://kitsu.io/.../the-world-s-best-engineer)<br><br>**Publishers**: o4y6k, 5rxd2, r4bd3, 7dknd, xzmqb, zm2rd<br><br>**Alternative Titles**:<br>- The Greatest Estate Designer<br>- The World's Best Engineer<br>- 역대급 영지 설계사<br>- El Mejor Ingeniero del Mundo<br>- El Mejor Diseñador Inmobiliario<br>- দ্য গ্রেটেস্ট এস্টেট ডেভেলপার<br>- 史上最高の領地設計士<br>- Yeokdaegeum Yeongji Seolgyesa<br>- MŚCICHUJ<br>- Система всемогущего дизайнера<br>- Bậc Thầy Thiết Kế Điền Trang<br>- 史诗级领地设计师<br>- 史詩級領地設計師<br><br>**Extra Info**:<br>Unofficial Fan Translation<br><br>Series/cameo mentioned in the manhwa<br><br>I Became the Chef of the Dragon King<br><br>What a Bountiful Harvest, Demon Lord!<br><br>The Apothecary Prince |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 172 chapters |  |  |  |
| chapter dates | PASS | 172 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://xcomic.me/.../LJennRM.zXp.w9YV.9eNYv.webp` (image/webp (encoding: lossy), 548564 bytes, 800x11130) |  |  |  |
