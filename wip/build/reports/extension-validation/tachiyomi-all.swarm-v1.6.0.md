# Extension Validation Report

- Extension: tachiyomi-all.swarm-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 7695050792030357361
- Source name: Swarm
- Source language: en
- Selected manga input: popular offset 0: Kininatteru Hito ga Otoko ja Nakatta (`.../kininatteru-hito-ga-otoko-ja-nakatta`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 39 | Kininatteru Hito ga Otoko ja Nakatta (`.../kininatteru-hito-ga-otoko-ja-nakatta`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Kimi ha Harumade Boku no Inu (`.../kimi-ha-harumade-boku-no-inu`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Secretary Scandal (R19) (`.../secretary-scandal-r19`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Kininatteru Hito ga Otoko ja Nakatta (`.../kininatteru-hito-ga-otoko-ja-nakatta`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kininatteru Hito ga Otoko ja Nakatta (`.../kininatteru-hito-ga-otoko-ja-nakatta`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 173 | Chapter 1 (`.../41e808e92f1a6`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 39 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kininatteru Hito ga Otoko ja Nakatta, URL=`kininatteru-hito-ga-otoko-ja-nakatta` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 159/159 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 152/159 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://swarm.ws/.../535vp5h70td.jpg` (image/jpeg, 2207017 bytes, 1725x2475) |  |  |  |
| details identity | PASS | Details preserved selected URL `kininatteru-hito-ga-otoko-ja-nakatta` |  |  |  |
| details thumbnail URL | PASS | `https://swarm.ws/.../535vp5h70td.jpg` |  |  |  |
| details author | PASS | Arai Sumiko |  |  |  |
| details artist | PASS | Sumiko Arai |  |  |  |
| details genres | PASS | Manga, Award Winning, Gyaru, Music, Romance, School Life, Slice of Life, Web Comic, Yuri |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Fashionable and upbeat high schooler Aya falls head over heels for an employee at a local CD shop. He’s got an air of mystery about him, always dressed well, and has impeccable taste in music. Little does she know — this supposedly male employee is actually her female classmate Mitsuki!<br><br>Mitsuki generally keeps to herself, but since her seat is right next to Aya’s, she can't help but be extremely aware of the other’s crush. Revealing the truth is out of the question — but perhaps getting closer to Aya wouldn’t be so bad...<br><br>\*\*\*Overwhelming winner in the Web category of the 2023 Tsugimanga Awards (by Kadokawa).\*\*\*<br><br>**Year:** 2022 · **Publishers:** KADOKAWA, Yen Press<br><br>**Alternative Names:**<br>- The Green Yuri<br>- The Guy She Was Interested in Wasn't a Guy at All<br><br>**Links:**<br>- \[Kadobun.jp\](https://kadobun.jp/.../kinioto)<br>- \[Kadokawa.co.jp\](https://www.kadokawa.co.jp/.../322205000709)<br>- \[Kadokawa.com.tw\](https://www.kadokawa.com.tw/.../9786263784697)<br>- \[Lojanewpop.com.br\](https://www.lojanewpop.com.br/.../buscar <redacted query values: q>)<br>- \[Mangetsu-manga.fr\](https://mangetsu-manga.fr/.../9782382817759-she-wasnt-a-guy-t01)<br>- \[Nashaidea.com\](https://nashaidea.com/.../ne-khlopets-tom-1)<br>- \[Twitter.com\](https://twitter.com/.../1512998788025110532)<br>- \[X.com\](https://x.com/.../kinioto_PR)<br>- \[AniList\](https://anilist.co/.../149544)<br>- \[Anime-Planet\](https://www.anime-planet.com/.../the-guy-she-was-interested-in-wasnt-a-guy-at-all)<br>- \[Comic Walker\](https://comic-walker.com/.../KDCW_CK01204024010000_68)<br>- \[Comick\](https://comick.dev/.../the-guy-she-was-interested-in-wasn-t-a-guy-at-all)<br>- \[Kitsu\](https://kitsu.io/.../63232)<br>- \[MangaBaka\](https://mangabaka.org/.../944)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../series.html <redacted query values: id>)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../d86l207)<br>- \[MyAnimeList\](https://myanimelist.net/.../155861)<br>- \[RidiBooks\](https://ridibooks.com/.../505100555)<br>- \[Shikimori\](https://shikimori.one/.../155861)<br>- \[Wikipedia\](https://en.wikipedia.org/.../The_Guy_She_Was_Interested_in_Wasn%27t_a_Guy_at_All)<br>- \[Wikipedia\](https://ja.wikipedia.org/.../%E6%B0%97%E3%81%AB%E3%81%AA%E3%81%A3%E3%81%A6%E3%82%8B%E4%BA%BA%E3%81%8C%E7%94%B7%E3%81%98%E3%82%83%E3%81%AA%E3%81%8B%E3%81%A3%E3%81%9F)<br>- \[Yen Press\](https://yenpress.com/.../the-guy-she-was-interested-in-wasn-t-a-guy-at-all) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 173 chapters |  |  |  |
| chapter dates | PASS | 173 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cash.swarm.ws/.../1.webp` (image/webp (encoding: lossy), 333082 bytes, 1444x2048) |  |  |  |
