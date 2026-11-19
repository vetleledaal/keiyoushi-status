# Extension Validation Report

- Extension: tachiyomi-en.comizy-v1.6.8
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangak
- Source ID: 7716662751992549719
- Source name: Comizy
- Source language: en
- Selected manga input: popular offset 0: Flashlight (`.../flashlight`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Flashlight (`.../flashlight`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | The Secretive XX (`.../the-secretive-xx`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Wrong Room (`.../the-wrong-room`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Ruler's Bedchamber (`.../the-rulers-bedchamber`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Flashlight (`.../flashlight`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Flashlight (`.../flashlight`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 83 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 73 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Flashlight, URL=`.../flashlight` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rx.comizy.io/.../e3e7a576bc6e.webp` (image/webp (encoding: lossy), 12318 bytes, 200x262) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../flashlight` |  |  |  |
| details thumbnail URL | PASS | `https://rx.comizy.io/.../e3e7a576bc6e.webp` |  |  |  |
| details author | PASS | Yangma |  |  |  |
| details artist | PASS | Yangma |  |  |  |
| details genres | PASS | Manhwa, Long Strip, Boys Love, Drama, Adult, Smut, Yaoi, Webtoons, Romance, actor/s, Anal Creampie, Anal Fingering, anal intercourse, Anal Toys, Anilingus, Beautiful art, Beauty Mark, big penis, Black-Haired Uke, Blonde-Haired Seme, bondage, Breastfeeding, Caught in the Act, Celebrity/ies, childhood friends, Choking, Clothed Intercourse, contractual relationship, Cowgirl Position, Cum Swallow, Cum Swap, Deepthroat, Doggy Style, Dominance/Dominating, drunken intercourse, Ear Licking, Elaborate Art Style, Exhibitionism, Fellatio/Blowjob, Full color, Great Mc, Great plot, green flag, Handjob, Hidden Sex, Horny Seme, Horny Uke, Jealous Seme, Kinky, Korean BL, Masculine Uke, Masochistic Uke, Masturbation, mature, Mirror Sex, Missionary Position, muscular seme, muscular uke, musician, Nipple Licking, nipple play, Official English Uncensored, older seme younger uke, Ongoing, Paizuri, Past Encounter, Past Plays a Big Role, Possessive Seme, promiscuous uke, Prostate, Prostate Massage, Public Sex, Relationship of Convenience, Reunion/s, Role Play, rough sex, Seke, seme falling in love first, Seme-like Uke, seme turned uke, sex toy/s, Sexually Insatiable Seme, Sexually Insatiable Uke, Shower Sex, Sleep Intercourse, Spanking, Squirting, trauma, Tsundere Character/s, uncen, uncensored, Uncensored Version Available, Versatile Uke, Webtoon/Webcomic, WORTH READING, yaoi/bl, acting, Elaborate, fake relationship, male lead, Primarily Adult Cast, celebrity, actor, bisexual, Oral Intercourse, reunion, tsundere, Nakadashi, Netorare, Nudity, Public Intercourse, Water sports, Erotica, Flashback/s, Longstrip, Love-Hate Relationship, Mature Romance, music, showbiz, Web Comic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 5 (1)<br>2024 · Pornographic<br><br>Aaron Hunter’s got it all. Looks, talent, and he just won the award for best actor. He does have one issue though: trouble sleeping. The only thing that’ll get him to fall asleep is a certain song by a certain someone. And when they finally meet, this is Aaron’s chance to get him to write a new song. But will the mysterious singer accept this deal? And will past traumas become illuminated by their newfound relationship…? *(Source: Lezhin)*<br><br>\[Original Webtoon\](https://lezhin.com/.../flashlight)<br><br>**Official Translations:**  <br>\[English\](https://lezhinus.com/.../flashlight_en), \[French\](https://lezhinfr.com/.../bt_1110940), \[Spanish\](https://lezhin.es/.../flashlight), \[T.Chinese\](https://bomtoon.tw/.../flashlight), \[Japanese\](https://beltoon.jp/.../flashlight), \[German\](https://www.lezhinde.com/.../dbd_00334), \[Thai\](https://lezhinth.com/.../flashlight)<br><br>**Alternative Names:**<br>- Flash Light<br>- フラッシュライト<br>- 플래시라이트<br><br>**Links:**<br>- \[AniList\](https://anilist.co/.../178842)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../hq9khf1)<br>- \[MangaBaka\](https://mangabaka.org/.../89382)<br>- \[MyAnimeList\](https://myanimelist.net/.../170831) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 83 chapters |  |  |  |
| chapter dates | PASS | 83 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 73 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://x5.cmzcdn.org/.../E0AIUAEZUVFXUU0KVAtQDAQAXhlQAgQKBldXDV1QAAE.webp` (image/webp (encoding: lossy), 144958 bytes, 1200x847) |  |  |  |
