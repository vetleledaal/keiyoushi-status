# Extension Validation Report

- Extension: tachiyomi-id.sasangeyou-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1153502662292268302
- Source name: Sasangeyou
- Source language: id
- Selected manga input: latest offset 0: Jimi-tomo, Mesu ni Naru (Original) Bahasa Indonesia (`.../jimi-tomo-mesu-ni-naru-original-bahasa-indonesia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Saimin Seishidou (Original) Bahasa Indonesia (`.../saimin-seishidou-original-all-chapters-bahasa-indonesia`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Miboujin no Haha – Sayoko ~Yojouhan ni Sumu Oyako no Koubi Kiroku~ (Original) Bahasa Indonesia (`.../miboujin-no-haha-%E3%83%BBsayoko-yojouhan-ni-sumu-oyako-no-koubi-kiroku-original-bahasa-indonesia`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Jimi-tomo, Mesu ni Naru (Original) Bahasa Indonesia (`.../jimi-tomo-mesu-ni-naru-original-bahasa-indonesia`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Mezase! Rakuen Keikaku (To LOVE-Ru) Bahasa Indonesia (`.../mezase-rakuen-keikaku-to-love-ru-bahasa-indonesia`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Jimi-tomo, Mesu ni Naru (Original) Bahasa Indonesia (`.../jimi-tomo-mesu-ni-naru-original-bahasa-indonesia`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Jimi-tomo, Mesu ni Naru (Original) Bahasa Indonesia (`.../jimi-tomo-mesu-ni-naru-original-bahasa-indonesia`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../jimi-tomo-mesu-ni-naru-original-bahasa-indonesia`) |  | 1-10s |
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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jimi-tomo, Mesu ni Naru (Original) Bahasa Indonesia, URL=`.../jimi-tomo-mesu-ni-naru-original-bahasa-indonesia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../Jimi-tomo-Mesu-ni-Naru_1.jpg <redacted query values: resize>` (image/jpeg, 18167 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jimi-tomo-mesu-ni-naru-original-bahasa-indonesia` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../Jimi-tomo-Mesu-ni-Naru_1.jpg` (image/jpeg, 85945 bytes, 1001x751) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Hekino Palace |  |  |  |
| details genres | PASS | Ahegao, Big oppai, Blowjob, Creampie, Handjob, Megane, Original, Paizuri, Doujin |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Download dan Baca Doujin Bahasa Indonesia!!! Jangan lupa comment, bookmark, atau share ya. Doujin Detail: Source 671952 Pages 58 Pages Total Chapters 1 Chapter TUTORIAL: Tutorial Download Tutorial diblokir Follow Sosial Media sasangeyou agar tidak ketinggalan Info: Linktree Discord Dilihat: 189<br><br>Alternative Names: Daigaku Jidai no Shinyuu to Sake no Ikioi de Sex Shichatta Hanashi, My Plain-Looking Friend Becomes My Girl. The Story of How I Ended Up Having Sex with My Best Friend from College after a Night of Drinking. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 59 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.sasangeyouku.my.id/.../Jimi-tomo-Mesu-ni-Naru_1.jpg.webp` (image/webp (encoding: lossy), 68812 bytes, 1001x751) |  |  |  |
