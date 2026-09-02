# Extension Validation Report

- Extension: tachiyomi-fr.hentaiscanreader-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 1
- Warnings: 3
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8376548397716758785
- Source name: Hentai Scan Reader
- Source language: fr
- Selected manga input: popular offset 0: Tensei Coliseum: Saijaku Skill de Saikyou no Onna-tachi o Koryaku Shite Dorei Harem Tsukurimasu (`.../tensei-coliseum-saijaku-skill-de-saikyou-no-onna-tachi-o-koryaku-shite-dorei-harem-tsukurimasu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Tensei Coliseum: Saijaku Skill de Saikyou no Onna-tachi o Koryaku Shite Dorei Harem Tsukurimasu (`.../tensei-coliseum-saijaku-skill-de-saikyou-no-onna-tachi-o-koryaku-shite-dorei-harem-tsukurimasu`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 15 | Women’s Army Recruit Training Center (`.../womens-army-recruit-training-center`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Thy will be done (`.../thy-will-be-done`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 9 | I Don’t Want To Lose to You! (`.../i-dont-want-to-lose-to-you`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Tensei Coliseum: Saijaku Skill de Saikyou no Onna-tachi o Koryaku Shite Dorei Harem Tsukurimasu (`.../tensei-coliseum-saijaku-skill-de-saikyou-no-onna-tachi-o-koryaku-shite-dorei-harem-tsukurimasu`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tensei Coliseum: Saijaku Skill de Saikyou no Onna-tachi o Koryaku Shite Dorei Harem Tsukurimasu (`.../tensei-coliseum-saijaku-skill-de-saikyou-no-onna-tachi-o-koryaku-shite-dorei-harem-tsukurimasu`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chap 1 Mon skill est trop nul…? (`.../mon-skill-est-trop-nul`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 59 |  |  | 1-10s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tensei Coliseum: Saijaku Skill de Saikyou no Onna-tachi o Koryaku Shite Dorei Harem Tsukurimasu, URL=`.../tensei-coliseum-saijaku-skill-de-saikyou-no-onna-tachi-o-koryaku-shite-dorei-harem-tsukurimasu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Tensei Coliseum: Saijaku Skill de Saikyou no Onna-tachi o Koryaku Shite Dorei Harem Tsukurimasu, URL=`.../tensei-coliseum-saijaku-skill-de-saikyou-no-onna-tachi-o-koryaku-shite-dorei-harem-tsukurimasu` at page 1 offset 0 and page 2 offset 4, title=The Eminence in Shadow -「I NEED MORE POWER!」(Doujinshi), URL=`.../the-eminence-in-shadow-%E3%80%8Ci-need-more-power%E3%80%8Ddoujinshi` at page 1 offset 4 and page 2 offset 13, title=Women’s Army Recruit Training Center, URL=`.../womens-army-recruit-training-center` at page 1 offset 7 and page 2 offset 0 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 43/43 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 42/43 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentai.scanreader.net/.../da202537-9298-4a6e-94ed-0705bb99c90b-211x300.jpg` (image/jpeg, 27673 bytes, 211x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tensei-coliseum-saijaku-skill-de-saikyou-no-onna-tachi-o-koryaku-shite-dorei-harem-tsukurimasu` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentai.scanreader.net/.../da202537-9298-4a6e-94ed-0705bb99c90b.jpg` (image/jpeg, 1150117 bytes, 1800x2560) |  |  |  |
| details author | PASS | Harawata Saizou |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Fantasy, Genderswap, Harem, Isekai, Loli, Magic, Ninja, Psychological, Réincarnation, Sexual Violence |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | His grades are average. His physical fitness is average. But when it comes to games, high school student Mikagami Kouji is a battle-worn veteran. After being summoned to another world by a magic circle, he’s given only the Copy skill, which is derided as useless trash in this world. Enslaved as a gladiator by his summoner, Head Priestess Zayd, Mikagami is forced to fight in the horrible Battle Coliseum. Losing means getting raped. In this moment, as despair turns to hope, this is Mikagami’s chance to grow!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 59 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hentai.scanreader.net/.../1-385cb0210225607aa6b2801c7223eeaecb413216e463b6550eeb5be6f9b4b792.png` (image/png, 3012902 bytes, 1440x2048) |  |  |  |
