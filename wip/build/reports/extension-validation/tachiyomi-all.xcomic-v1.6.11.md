# Extension Validation Report

- Extension: tachiyomi-all.xcomic-v1.6.11
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.l
- Source ID: 1951931397842101209
- Source name: XCOMIC
- Source language: en
- Selected manga input: latest offset 0: A Certain Magical Index: A Certain Scientific Mental Out (`.../xdyke`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | On the Way to Meet Mom (`.../4wwyl`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | The Fragrant Flower Blooms with Dignity (`.../988an`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | A Certain Magical Index: A Certain Scientific Mental Out (`.../xdyke`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Kindergarten for Divine Beasts (`.../bl74g`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Certain Magical Index: A Certain Scientific Mental Out (`.../xdyke`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Certain Magical Index: A Certain Scientific Mental Out (`.../xdyke`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 269 | Vol.1 Ch.1.1 (`.../g5q4ea5`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Certain Magical Index: A Certain Scientific Mental Out, URL=`xdyke` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://xcomic.me/.../e1dcc2d2ac3f6fc77ce1b7a5738a44d4a5628bd9.460.643.48650.webp` (image/webp (encoding: lossy), 48650 bytes, 460x643) |  |  |  |
| details identity | PASS | Details preserved selected URL `xdyke` |  |  |  |
| details thumbnail URL | PASS | `https://xcomic.me/.../e1dcc2d2ac3f6fc77ce1b7a5738a44d4a5628bd9.460.643.48650.webp` |  |  |  |
| details author | PASS | Kazuma Kamachi |  |  |  |
| details artist | PASS | Yasuhito Nogi |  |  |  |
| details genres | PASS | Manga, Seinen, Shounen, Suggestive, Sci Fi, Supernatural, Action, Comedy, Slice Of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | **Original**: Japanese<br>**Translated**: Arabic, English, Spanish (LA), French, Indonesian, Portuguese (BR), Russian, Vietnamese, Chinese<br>**Publication**: 2021 - Ongoing<br>**Updated**: 2026-11-19<br><br>**Statistics**<br>**Score**: 7.4 · **Votes**: 15 · **Follows**: 129 · **Comments**: 3 · **Chapters**: 62<br><br>**Description**<br>The Tokiwadai student council election is approaching. Shokuhou Misaki, one of the leading candidates, is in the midst of an election campaign in spite of her own expectations due to the people around her and the fate of being the head of the largest clique...!! <br><br>(Source: Toaru Wiki)<br><br>**External Links**:<br>- \[AniList\](https://anilist.co/.../137145)<br>- \[MyAnimeList\](https://myanimelist.net/.../139100)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../2gsdzfg)<br>- \[Kitsu\](https://kitsu.app/.../60577)<br>- \[Anime-Planet\](https://www.anime-planet.com/.../toaru-kagaku-no-mental-out)<br>- \[Shikimori\](https://shikimori.io/.../139100)<br>- \[MangaBaka\](https://mangabaka.org/.../1751)<br><br>**Alternative Titles**:<br>- とある科学の心理掌握<br>- Toaru Kagaku no Mental Out<br>- A Certain Scientific Mental Out<br>- To Aru Kagaku no Mentaru Auto<br>- To Aru Kagaku no Shinri Shouaku<br>- Toaru Majutsu no Index Gaiden: Toaru Kagaku no Mental Out<br>- Toaru Majutsu no Index Gaiden: Toaru Kagaku no Shinri Shouaku<br>- Некий научный Ментал Аут<br>- مانجا الملكة النحلة شوكهو ميساكي - مينتل-آوت<br>- とある魔術の禁書目録外伝　とある科学の心理掌握<br>- とある魔術の禁書目録外伝 とある科学の心理掌握〈メンタルアウト〉<br>- 科學心理掌握<br>- To Aru Kagaku no Mental Out |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 5 name, chapter 6 name |  |  |  |
| chapters | PASS | 269 chapters |  |  |  |
| chapter dates | PASS | 269 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i07.img02.org/.../J4Qezw8.Lbq.zyw.zPwK8.webp` (image/webp (encoding: lossless), 620300 bytes, 836x1200) |  |  |  |
