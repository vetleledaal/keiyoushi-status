# Extension Validation Report

- Extension: tachiyomi-id.wurmz-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 925868633785419090
- Source name: Wurmz
- Source language: id
- Selected manga input: popular offset 0: Beware of the Strongest Man Who is Crazy About Me (`.../waspadalah-terhadap-pria-terkuat-yang-tergila-gila-padaku`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Beware of the Strongest Man Who is Crazy About Me (`.../waspadalah-terhadap-pria-terkuat-yang-tergila-gila-padaku`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | The Little Brother Is the Academy's Hotshot (`.../adik-laki-laki-adalah-jagoan-akademi`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | Beware of the Strongest Man Who is Crazy About Me (`.../waspadalah-terhadap-pria-terkuat-yang-tergila-gila-padaku`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Beware of the Strongest Man Who is Crazy About Me (`.../waspadalah-terhadap-pria-terkuat-yang-tergila-gila-padaku`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 73 | Chapter 0 (`.../0`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Beware of the Strongest Man Who is Crazy About Me, URL=`.../waspadalah-terhadap-pria-terkuat-yang-tergila-gila-padaku` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wurmz.net/.../manhwa__waspadalah-terhadap-pria-terkuat-yang-tergila-gila-padaku.webp` (image/webp (encoding: lossy), 18380 bytes, 220x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../waspadalah-terhadap-pria-terkuat-yang-tergila-gila-padaku` |  |  |  |
| details thumbnail URL | PASS | `https://wurmz.net/.../manhwa__waspadalah-terhadap-pria-terkuat-yang-tergila-gila-padaku.webp` |  |  |  |
| details author | PASS | Ed 작가님 \| 몰랑토끼 작가님 / 르기 작가님 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Gender Bender, Historical, Isekai, Josei, Reincarnation, Romance, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Suatu hari, saudara perempuanku putus dengan pemeran utama pria. Aku tidak tahan melihatnya murung, jadi aku mengambil keputusan sendiri untuk menemukan ksatria itu. Rencananya sederhana: menyampaikan ketulusan adikku dan memperbaiki keadaan. Namun, ketika aku akhirnya mencapai tempat itu, ksatria itu sudah tidak ditemukan lagi… "Aku tidak peduli lagi apakah kamu laki-laki atau alien." "Sebenarnya, aku ini alien!" "Itu membuatnya semakin menarik." Alih-alih bertemu dengan orang yang ingin kutemui, aku malah bertemu dengan pria gila. * * * 내게 미친 세계관 최강자를 조심할 것 Itu adalah pertemuan pertama yang mengerikan. Aku gemetar ketakutan, tapi aku tidak bisa membiarkan diriku menyerah begitu saja. Bertekad, aku memilih untuk diam-diam mengamati dan menunggu waktuku, menunggu kesempatan sempurna untuk bertemu dengan pemeran utama pria sendirian, seperti bayangan. Namun, ada masalah kecil yang muncul. "Lebih baik menyerah." "Apa maksudmu tiba-tiba…?" "Saya tidak berniat hanya menonton saat Anda mengalihkan perhatian Anda ke pria lain." Sepertinya pria gila ini salah paham akan sesuatu. * * * Saya Charlotte La Bravant, wanita yang pantang menyerah. Setelah banyak usaha, saya mencapai tujuan saya dan dengan cepat melarikan diri, menikmati kegembiraan karena kesuksesan. Dan mengapa saya tidak berhasil? Aku adalah adik perempuan dari Marquess Bravant yang terhormat, yang juga dikenal sebagai mawar mempesona dari masyarakat kelas atas! "Apakah kamu pikir kamu bisa melarikan diri dan aku tidak akan menemukanmu?" "B-bagaimana kabarmu…?" "Kamu menjadi lebih cantik sejak terakhir kali aku melihatmu. Jadi, apakah pelukan pria itu hangat?" "Apa?" Mata sang duke menjadi lebih tajam saat dia mengatakan itu.<br><br>Nama Alternatif: Beware of the Strongest Man Who is Crazy About Me |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 73 chapters |  |  |  |
| chapter dates | LINT | All 73 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=73 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | details: `https://wurmz.net/.../waspadalah-terhadap-pria-terkuat-yang-tergila-gila-padaku` to `https://wurmz.net/.../waspadalah-terhadap-pria-terkuat-yang-tergila-gila-padaku <redacted query values: _rsc>` (1 redirects); chapters: `https://wurmz.net/.../waspadalah-terhadap-pria-terkuat-yang-tergila-gila-padaku` to `https://wurmz.net/.../waspadalah-terhadap-pria-terkuat-yang-tergila-gila-padaku <redacted query values: _rsc>` (1 redirects); pages: `https://wurmz.net/.../0` to `https://wurmz.net/.../0 <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.uqni.net/.../415372aol6hmvctje001.jpg` (image/jpeg, 21807 bytes, 720x480) |  |  |  |
