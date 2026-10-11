# Extension Validation Report

- Extension: tachiyomi-all.xcomic-v1.6.9
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.v
- Source ID: 1951931397842101209
- Source name: XCOMIC
- Source language: en
- Selected manga input: latest offset 0: Whose Baby is it? (`.../wm4dy`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | On the Way to Meet Mom (`.../4wwyl`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | The Fragrant Flower Blooms with Dignity (`.../988an`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Whose Baby is it? (`.../wm4dy`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | I Was Reincarnated as the Heroine on the Verge of a Bad Ending, and I’m Determined to Fall in Love! (`.../g9y9p`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Whose Baby is it? (`.../wm4dy`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Whose Baby is it? (`.../wm4dy`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3492 | Vol.0 Ch.0: prologue - battle for the "treasure" (`.../24qgewj`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 25 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Whose Baby is it?, URL=`wm4dy` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://xcomic.me/.../6714b4cbb5b81d445f3968eecc3e7e274a8a5406.750.1000.136324.webp` (image/webp (encoding: lossy), 136324 bytes, 750x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `wm4dy` |  |  |  |
| details thumbnail URL | PASS | `https://xcomic.me/.../6714b4cbb5b81d445f3968eecc3e7e274a8a5406.750.1000.136324.webp` |  |  |  |
| details author | PASS | Wenren Niao Shi Duo |  |  |  |
| details artist | PASS | Miji, Wuxian Zuoye |  |  |  |
| details genres | PASS | Manhua, Safe, Fantasy, Supernatural, Boys Love, Comedy, Drama, Slice Of Life, Tragedy, Longstrip, Full Color, Web Comic |  |  |  |
| details status | PASS | PUBLISHING_FINISHED (4) |  |  |  |
| details description | PASS | **Original**: Chinese<br>**Translated**: English, Spanish (LA), Filipino, French, Indonesian, Korean, Portuguese (BR)<br>**Publication**: 2018-07-15 - Ongoing<br>**Updated**: 2026-10-11<br><br>**Statistics**<br>**Score**: 8.6 · **Votes**: 1964 · **Follows**: 20062 · **Reviews**: 282 · **Comments**: 23336 · **Chapters**: 366<br><br>**Description**<br>According to the fortune-teller, I was born to be unlucky...was he kidding me?! My child owns the super power that can turn calamities into blessings through dreams! But the bossy president suddenly claimed that he's the natural father of my babe?! And he even kidnapped me and my child?! <br><br>(Source: Webcomics) <br><br>*Note: Includes 23 extra chapters.*<br><br>**External Links**:<br>- \[AniList\](https://anilist.co/.../117747)<br>- \[MyAnimeList\](https://myanimelist.net/.../132365)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../48n8ud9)<br>- \[Kitsu\](https://kitsu.app/.../56941)<br>- \[Anime-Planet\](https://www.anime-planet.com/.../whose-baby-is-it)<br>- \[Shikimori\](https://shikimori.io/.../132365)<br>- \[MangaBaka\](https://mangabaka.org/.../30445)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../48n8ud9)<br>- \[MyAnimeList\](https://myanimelist.net/.../132365)<br>- \[Anime-Planet\](https://www.anime-planet.com/.../manga)<br>- \[AniList\](https://anilist.co/.../117747)<br>- \[Kitsu\](https://kitsu.app/.../manga)<br><br>**Alternative Titles**:<br>- 哪里来的大宝贝<br>- Nali Lai De Da Baby<br>- 베이비가 생겼어요<br>- Cục Cưng Ở Đâu Ra<br>- Đại Bảo Bối Từ Đâu Tới<br>- ¿De quién es el bebé?<br>- Kaninong anak ito?<br>- Nǎlǐ Lái de Dàbǎobèi<br>- Strings of Destiny<br>- Whose Baby Is It?<br>- Чей это ребёнок?<br>- บิ๊ก เบบี้ เด็กคนนี้เป็นลูกผม<br>- 我が子が一番！<br>- ¿De quien es el bebe?<br>- Nali Lai De Da Baobei<br>- Whose Baby Is It?!<br>- WHOSE BABY IS IT<br>- Nali Lai de Da Baobei |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3492 chapters |  |  |  |
| chapter dates | PASS | 3492 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i07.img00.org/.../o4zKvVm.ZbY.LDD.qnDJ.webp` (image/webp (encoding: lossy), 20966 bytes, 750x1080) |  |  |  |
