# Extension Validation Report

- Extension: tachiyomi-en.eighteenporncomic-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: manga18
- Source ID: 5133553291675008671
- Source name: 18 Porn Comic
- Source language: en
- Selected manga input: latest offset 0: Ore, isekai de shibori torarete masu... (`.../ore-isekai-de-shibori-torarete-masu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Secret Class Uncensored (`.../secret-class-uncensored`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | XXX Apartments [Kirtu] (`.../xxx-apartments-kirtu`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Ore, isekai de shibori torarete masu... (`.../ore-isekai-de-shibori-torarete-masu`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Yariman no Namaiki Kouhai to Tsukiau made no Hanashi. (`.../yariman-no-namaiki-kouhai-to-tsukiau-made-no-hanashi`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ore, isekai de shibori torarete masu... (`.../ore-isekai-de-shibori-torarete-masu`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ore, isekai de shibori torarete masu... (`.../ore-isekai-de-shibori-torarete-masu`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | # English (`.../english`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 85 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ore, isekai de shibori torarete masu..., URL=`.../ore-isekai-de-shibori-torarete-masu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://bk.18porncomic.com/.../cover_thumb_2.webp` (image/jpeg, 12130 bytes, 150x200; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ore-isekai-de-shibori-torarete-masu` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://bk.18porncomic.com/.../cover_250x350.jpg` (image/jpeg, 32082 bytes, 250x350) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Yuniba |  |  |  |
| details genres | PASS | Big Breasts, Exhibitionism, Ponytail, Masturbation, Kemonomimi, Femdom, Blowjob, Paizuri, Stockings, Futanari, Ahegao, Nakadashi, Hairy, Elf, Hentai, Unusual Pupils, Kissing, Tomgirl, Blowjob Face, Catgirl, Fingering, Assjob, Incomplete, Crossdressing, Witch, Catboy, Tail, Shimapan, Collar, Clothed Paizuri, Very Long Hair, Nipple Stimulation, Penis Enlargement, Dickgirl On Female |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ore, isekai de shibori torarete masu... Hentai also known as (AKA) I’m Getting Milked Dry in Another World \| ギルド受付嬢とデート中にまた搾り取られてます… . This OnGoing 18PornComic was released on. Ore, isekai de shibori torarete masu... is about Big Breasts, Exhibitionism, Ponytail, Masturbation, Kemonomimi, Femdom, Blowjob, Paizuri, Stockings, Futanari, Ahegao, Nakadashi, Hairy, Elf, Hentai, Unusual Pupils, Kissing, Tomgirl, Blowjob Face, Catgirl, Fingering, Assjob, Incomplete, Crossdressing, Witch, Catboy, Tail, Shimapan, Collar, Clothed Paizuri, Very Long Hair, Nipple Stimulation, Penis Enlargement, Dickgirl On Female, comic.<br><br>Alternative Names:<br>I’m Getting Milked Dry in Another World \| ギルド受付嬢とデート中にまた搾り取られてます… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 85 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | latest: `http://bk.18porncomic.com/.../cover_thumb_2.webp` to `https://bk.18porncomic.com/.../cover_thumb_2.webp` (1 redirects) |  |  |  |
| page load | PASS | `https://bk.18porncomic.com/.../01.jpg` (image/jpeg, 525035 bytes, 1280x1780) |  |  |  |
