# Extension Validation Report

- Extension: tachiyomi-en.mangabuddy-v1.6.39
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
- Source implementation: keiyoushi.source.Generated
- Source theme: mangak
- Source ID: 5020395055978987501
- Source name: MangaK
- Source language: en
- Selected manga input: popular offset 0: PASSION (`.../passion`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | PASSION (`.../passion`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Solo Max-Level Newbie (`.../solo-max-level-newbie`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Little Skeleton (`.../little-skeleton`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Haru wa Kimi ni Sasayaku (`.../haru-wa-kimi-ni-sasayaku`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | PASSION (`.../passion`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | PASSION (`.../passion`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 206 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 3 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=PASSION, URL=`.../passion` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rx.resmk.org/.../2d225b299b1c.webp` (image/webp (encoding: lossy), 10998 bytes, 200x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../passion` |  |  |  |
| details thumbnail URL | PASS | `https://rx.resmk.org/.../2d225b299b1c.webp` |  |  |  |
| details author | PASS | Yuji, Havana, U-Ji Yu |  |  |  |
| details artist | PASS | damc, Kangjak, Kang-Jak |  |  |  |
| details genres | PASS | Manhwa, Long Strip, Action, Drama, Yaoi, Smut, Webtoons, Boys Love, Psychological, Romance, Adult, Full Color, Webtoon/Webcomic, based on a novel, Smoking, Handsome Male Lead, strong male lead, based on a korean novel, Korean BL, Korean/s, Caught in the Act, Fellatio/Blowjob, Love Triangle/s, rough sex, Uncensored Version Available, twins, Appearance Different from Personality, anal intercourse, Dubious Consent, older uke younger seme, Rape, Adapted to Audio Drama, attempted murder, Secret Identity, Training, Handjob, Handsome Seme, Masculine Uke, Punishment/s, Possessive Seme, Seme-like Uke, Unrequited Love Stays Unrequited, Spy/ies, kidnapping/s, seme turned uke, Secret Agent/s, Frottage, prison, Muscles, Same Age, chaebol, Psychopath/s, Scary seme, Yandere Seme, Isolated Location, Multiple Orgasms, Strong Seme, Versatile Uke, Military Academy, Enemies Become Lovers, Soldier/s, Anal Creampie, Blushing Uke, Unreliable Narrator, White/Silver-Haired Seme, German/s, Mutual Masturbation, Hong Kong, hand fetish, yaoi/bl, dom/subverse, WORTH READING, Great plot, Ongoing, power bottom, yaoii, Beautiful art, misunderstanding/s, Revenge, strong mc, mature, manwha, Unique Plot, crazy ml, red flag, obsessive top, obsession, crazy, Anilingus, Based on a Web Novel, Erotica, Foreign, gun/s, kidnapping, Korean Boys Love, Longstrip, love triangle, male lead, military, Obsessive Love, Oral Intercourse, Primarily Adult Cast, Primarily Male Cast, Soldier, Spy, War, weak to strong, Web Comic, yandere, Secret Agent, Punishment, Abusive Seme, German, Interracial Couple, Rape as a Start of Relationship, violence |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★✬ 4.38 (654)<br>2020 · Pornographic<br><br>Jeong Taeui has always lived in the shadow of his genius twin brother, but he’s never been unhappy with his ordinary life. When his uncle shows up at his doorstep with a dangerous job offer disguised as a once-in-a-lifetime opportunity, Taeui is skeptical, but he reluctantly agrees to work as an agent for half a year. Despite his initial qualms, he quickly adjusts to his new environment using his outgoing, positive personality. But from the moment Taeui meets Ilay Riegrow, an agent from another branch, his peaceful life slowly starts to change. Everyone says Ilay is a sadistic psychopath who should be avoided at all costs, but Taeui knows there’s more to him than meets the eye. But getting to know Ilay is like playing with fire, and Taeui isn’t sure if he’s ready to get burned. *(Source: Tappytoon)*<br><br>**Original Novel:**  <br>\[RIDI\](https://ridibooks.com/.../3086000444), \[MrBlue\](https://www.mrblue.com/.../181100649), \[Bomtoon\](https://www.bomtoon.com/.../passion_o)<br><br>**Official Novel Translations:**  <br>\[English: Publang 2026\](https://x.com/.../1959031336246649343) \| \[Taiwanese\](https://koonbooks.com/.../passion-taiwanese-novel <redacted query values: _pos, _sid, _ss, and _fid>)    <br><br>**\[Audio Drama\](https://audiocomics.kr/.../107)**<br><br>**Original Webtoon:**  <br>\[RIDI\](https://ridibooks.com/.../4117000069)<br><br>**Official Translations:**  <br>English: \[Tappytoon\](https://www.tappytoon.com/.../passion-m)  <br>T.Chinese: \[Bookwalker\](https://www.bookwalker.com.tw/.../27467), \[Renta\](https://tw.myrenta.com/.../289761)  <br>Others: \[French\](https://www.tappytoon.com/.../passion-m-fr), \[German\](https://www.tappytoon.com/.../passion-m-de), \[Thai\](https://www.wecomics.in.th/.../18547)<br><br>##### Note: The official T.Chinese translation is uncensored.<br><br>**Alternative Names:**<br>- PASSION by Yuji<br>- Passion(패션)<br><br>**Links:**<br>- \[AniList\](https://anilist.co/.../129247)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../j60f51x)<br>- \[MangaBaka\](https://mangabaka.org/.../113628)<br>- \[MyAnimeList\](https://myanimelist.net/.../184873) |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 22 name, chapter 90 name, chapter 106 name, chapter 168 name |  |  |  |
| chapters | PASS | 206 chapters |  |  |  |
| chapter dates | PASS | 206 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rx.qvzra.org/.../5968c569bc7a.webp` (image/webp (encoding: lossy), 64768 bytes, 768x1024) |  |  |  |
