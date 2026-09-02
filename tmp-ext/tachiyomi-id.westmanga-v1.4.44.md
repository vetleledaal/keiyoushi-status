# Extension Validation Report

- Extension: tachiyomi-id.westmanga-v1.4.44
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8883916630998758688
- Source name: West Manga
- Source language: id
- Selected manga input: popular offset 0: Yuusha Party wo Kubi ni Natta node Kokyou ni Kaettara, Member Zenin ga Tsuitekitandaga (`.../yuusha-party-wo-kubi-ni-natta-node-kokyou-ni-kaettara-member-zenin-ga-tsuitekitandaga`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Yuusha Party wo Kubi ni Natta node Kokyou ni Kaettara, Member Zenin ga Tsuitekitandaga (`.../yuusha-party-wo-kubi-ni-natta-node-kokyou-ni-kaettara-member-zenin-ga-tsuitekitandaga`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | I Killed An Academy Player (`.../i-killed-an-academy-player`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Yotte, Hatsukoi wa Shoumei sareta. - Delta to Gamma no Rigakubu Note - (`.../yotte-hatsukoi-wa-shoumei-sareta-delta-to-gamma-no-rigakubu-note`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Futari Bus (`.../futari-bus`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | Yuusha Party wo Kubi ni Natta node Kokyou ni Kaettara, Member Zenin ga Tsuitekitandaga (`.../yuusha-party-wo-kubi-ni-natta-node-kokyou-ni-kaettara-member-zenin-ga-tsuitekitandaga`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Yuusha Party wo Kubi ni Natta node Kokyou ni Kaettara, Member Zenin ga Tsuitekitandaga (`.../yuusha-party-wo-kubi-ni-natta-node-kokyou-ni-kaettara-member-zenin-ga-tsuitekitandaga`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 21 | Chapter 01 (`.../yuusha-party-wo-kubi-ni-natta-node-kokyou-ni-kaettara-member-zenin-ga-tsuitekitandaga-chapter-01-bahasa-indonesia`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yuusha Party wo Kubi ni Natta node Kokyou ni Kaettara, Member Zenin ga Tsuitekitandaga, URL=`.../yuusha-party-wo-kubi-ni-natta-node-kokyou-ni-kaettara-member-zenin-ga-tsuitekitandaga` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.westmanga.blog/.../ed694800-c490-11f0-a03b-55dd99de58a2.jpg` (image/jpeg, 133121 bytes, 512x728) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yuusha-party-wo-kubi-ni-natta-node-kokyou-ni-kaettara-member-zenin-ga-tsuitekitandaga` |  |  |  |
| details thumbnail URL | PASS | `https://storage.westmanga.blog/.../ed694800-c490-11f0-a03b-55dd99de58a2.jpg` |  |  |  |
| details author | PASS | Kinome |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Comedy, Fantasy, Harem, Romance, Shounen, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kisah Romcom harem, bercerita tentang MC kita yang dikeluarin dari Party pahlawannya, dan anehnya yang ngekik malah ikut MC, tapi di sini beliau dikeluarkan karena suatu alasan...yah, intinya ini cerita romcom full gula MC dengan ketiga istrinya yang cantik nan imut.. dan pastinya para karbit akan bilang my kisah... dasar karbit luh.<br><br>Alternative Name: 勇者パーティーをクビになったので故郷に帰ったら、メンバー全員がついてきたんだが, I Got Kicked Out of the Hero’s Party, so I Went Back to My Hometown, but the Entire Party Followed Me, Yuusha Party o Kubi ni Natta no de Kokyou ni Kaettara, Member Zen’in ga Tsuitekita n da ga, I Got Fired from the Hero Party, So I Went Back to My Hometown, but All the Party Members Followed Me, Yusha Party Wo Kubi Ni Nattanode Kokyo Ni Kaettara, Member Zenin Ga Tsuitekita Ndaga |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.westmanga.blog/.../8ba4ac40-b29d-11f0-a6ff-b7292f45570e.jpg` (image/jpeg, 147389 bytes, 850x1298) |  |  |  |
