# Extension Validation Report

- Extension: tachiyomi-en.mangadotnet-v1.6.25
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 23
- Lint: 0
- Warnings: 0
- Skipped: 11
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 5900936305360403385
- Source name: MangaDot
- Source language: en
- Selected manga input: popular offset 0: The Greatest Estate Developer (`.../194`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | The Greatest Estate Developer (`.../194`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 28 | Witch Hat Atelier (`.../123`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | The Lady Who Rejected the Prince (`.../50653`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | Only Hope (`.../5921`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Greatest Estate Developer (`.../194`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 112/112 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 112/112 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://mangadot.net/.../2f974040567c8a68452a2ae2.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `194` |  |  |  |
| details thumbnail URL | PASS | `https://mangadot.net/.../2f974040567c8a68452a2ae2.webp` |  |  |  |
| details author | PASS | ​Baek-Gyeong Mun, Hyeon-Min Lee |  |  |  |
| details artist | PASS | ​​Hyeon-Su Kim |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Comedy, Drama, Fantasy, Shounen, Advanced Knowledge Meets Archaic World, Agriculture, Anachronism, Animals, Annoying Male Lead, Anti-Hero, Arrogant Characters, Assertive Female Lead, Based on a Novel, Based on a Web Novel, Blackmail, Blushing Character, Bromance, Brown-Haired Male Lead, Brown-Haired Protagonist, Butler, Chimera, Class Struggle, Comedic Undertone, Countryside, Debts, Determined Male Lead, Devoted Male Lead, Economics, Elaborate, Elves, Engineering, Europe, European Ambience, Famous Female Lead, Famous Male Lead, Female Empowerment, Female Lead Falls in Love First, Friendship, Full Color, Game Elements, Hard-Working Protagonist, Hell, Heterosexual, Human-Nonhuman Friendship, Human-Nonhuman Relationship, Interspecies Relationship, Isekai, Isekaied Into a Novel, Kind Male Lead, Kingdom, Kingdom Management, Knight, Lake, Longstrip, Loyal Male Lead, Loyal Servant, Magic, Male Lead, Manipulative Male Lead, Marriage, Master-Servant Relationship, Middle Eastern, Military, Monsters, Muscles, Nobility, Non-BL with Two Male Leads, Parody, Personality Change, Politics, Politics Involving Royalty, Quirky Character, Romantic Subplot, Royalty, Rural, Ruthless Character, Scary Male Lead, Seeing Things Other Humans Can't, Sharp-Tongued Female Lead, Shounen, Singing, Slapstick, Smart Female Lead, Smart Male Lead, Smart Protagonist, Strong Female Lead, Strong Protagonist, Surreal Comedy, Swordplay, Swords, Swordsman, Swordswoman, System Administrator, Teasing Character, Teasing Male Lead, Transmigration, Transported to Another World, Travel, Ugly Male Lead, Unrealistic Fighting, Violence, Weak to Strong, Web Comic, Workaholic, Younger Brother |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★★ 9.4<br><br>**Year:** 2021 · **Chapters:** 235 · **Volumes:** 0 · **Tracked:** 2367 · **Content Rating:** Safe · 310 ratings<br><br>---<br><br>When civil engineering student Su-Ho Kim falls asleep reading a fantasy novel, he wakes up as a character in the book! Su-Ho is now in the body of Lloyd Frontera, a lazy noble who loves to drink, and whose family is in a mountain of debt. Using his engineering knowledge, Su-Ho designs inventions to avert the terrible future that lies in wait for him. With the help of a giant hamster, a knight, and the world’s magic, can Su-Ho dig his new family out of debt and build a better future? <br><br>(Source: WEBTOON, edited)<br><br>*Note: Includes 12 extra chapters.*<br><br><br>**Links:**<br>- \[AniList\](https://anilist.co/.../140407)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../chin5uq)<br>- \[MangaBaka\](https://mangabaka.org/.../3391)<br>- \[MyAnimeList\](https://myanimelist.net/.../147272)<br>- \[Kitsu\](https://kitsu.app/.../60854)<br>- \[AnimePlanet\](https://www.anime-planet.com/.../the-greatest-estate-developer)<br>- \[Shikimori\](https://shikimori.io/.../147272)<br>- \[Source\](https://atsu.moe/.../fX0YJ)<br><br>**Alternative Names:**<br>- 역대급 영지 설계사<br>- Bậc Thầy Thiết Kế Điền Trang<br>- El mejor desarrollador inmobiliario<br>- El Mejor Diseñador Inmobiliario<br>- El Mejor Ingeniero del Mundo<br>- Loco Frontera<br>- MŚCICHUJ<br>- O Melhor Engenheiro Do Mundo<br>- The Greatest Estate Designer<br>- The World's Best Engineer<br>- Yeogdaegeub Yeongji Seolgyesa<br>- Yeokdaegeum Yeongji Seolgyesa<br>- Yeokdaegeup Yeongji Seolgyesa<br>- Лучший инженер в мире<br>- Система всемогущего дизайнера<br>- দ্য গ্রেটেস্ট এস্টেট ডেভেলপার<br>- ยอดสถาปนิกผู้พิทักษ์อาณาจักร<br>- 史上最高の領地設計士<br>- 史詩級領地設計師<br>- 史诗级领地设计师 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
