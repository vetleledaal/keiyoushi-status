# Extension Validation Report

- Extension: tachiyomi-all.cinblue-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 6252997692648633798
- Source name: Cin.blue
- Source language: en
- Selected manga input: popular offset 0: [MM] Ecchi na Omise ni Ittara, Mukashi no Doukyuusei ga Ita Hanashi [English] [AI-Translated] (`.../695586`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | [MM] Ecchi na Omise ni Ittara, Mukashi no Doukyuusei ga Ita Hanashi [English] [AI-Translated] (`.../695586`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | The story of how the perverts seduced the older female ninja - Ino (`.../695621`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | [Onikubo Hirohisa] Inbi na Torappu ni Hamerareru Onna-tachi ~Wana ni Ochita Hitozuma to Aidoru~ [Digital] (`.../698277`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | [Souma] Abu Ona Danshi 2 [Eng] (`.../698227`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [MM] Ecchi na Omise ni Ittara, Mukashi no Doukyuusei ga Ita Hanashi [English] [AI-Translated] (`.../695586`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [MM] Ecchi na Omise ni Ittara, Mukashi no Doukyuusei ga Ita Hanashi [English] [AI-Translated] (`.../695586`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../695586`) |  | <1s |
| pages | `getPageList(chapter)` | success | 136 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[MM\] Ecchi na Omise ni Ittara, Mukashi no Doukyuusei ga Ita Hanashi \[English\] \[AI-Translated\], URL=`695586` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://d.kontol.online/.../thumb.webp` (image/webp (encoding: lossy), 32752 bytes, 500x700) |  |  |  |
| details identity | PASS | Details preserved selected URL `695586` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://a.kontol.online/.../thumb.webp` (image/webp (encoding: lossy), 32752 bytes, 500x700) |  |  |  |
| details author | PASS | mmchair |  |  |  |
| details artist | PASS | mmchair |  |  |  |
| details genres | PASS | big breasts, sole female, nakadashi, blowjob, schoolgirl uniform, glasses, ahegao, ponytail, big penis, hairy, kissing, masturbation, bikini, rough translation, schoolboy uniform, exhibitionism, fingering, handjob, cunnilingus, prostitution, squirting, gyaru, nipple stimulation, virginity, deepthroat, blowjob face, bloomers, gokkun, voyeurism, clit stimulation, school gym uniform, shaved head, focus blowjob, transparent clothing |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Parodies:** original · **Languages:** translated, english · **Categories:** doujinshi · **Pages:** 136<br><br>**Alternative Names:**<br>- \\[MM\\] エッチなお店に行ったら、昔の同級生がいた話<br>- Ecchi na Omise ni Ittara, Mukashi no Doukyuusei ga Ita Hanashi |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 136 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://a.kontol.online/.../1.webp` (image/webp (encoding: lossy), 193996 bytes, 1280x1791) |  |  |  |
